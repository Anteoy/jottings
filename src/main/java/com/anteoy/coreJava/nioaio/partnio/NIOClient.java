package com.anteoy.coreJava.nioaio.partnio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @auther zhoudazhuang
 * @date 19-5-9 18:53
 * @description
 */
public class NIOClient {
    private static int bufferSize = 4096;
    private static ByteBuffer receiveBuffer = ByteBuffer.allocate(bufferSize);
    private static ByteBuffer sendBuffer = ByteBuffer.allocate(bufferSize);
    private  static int flag = 1;
    private  final  static InetSocketAddress INET_SOCKET_ADDRESS = new InetSocketAddress("127.0.0.1", 8080);
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        //打开选择器
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
//        socketChannel.connect(INET_SOCKET_ADDRESS); //需要下面代码debug
        //向服务端发起连接
        if (!socketChannel.connect(INET_SOCKET_ADDRESS)){
            //不断地轮询连接状态，直到完成连接
            while (!socketChannel.finishConnect()){
                //在等待连接的时间里，可以执行其他任务，以充分发挥非阻塞IO的异步特性
                //这里为了演示该方法的使用，只是一直打印"."
                System.out.println("连接中...");
            }
            System.out.println("完成连接");
        }


        Set<SelectionKey> selectionKeys;
        Iterator<SelectionKey> iterator;
        SelectionKey selectionKey;
        SocketChannel client;
        String receiveText = null;
        String sendText = null;

        while(true){
            selectionKeys = selector.selectedKeys();
            iterator = selectionKeys.iterator();
//      System.out.println(11111);
            while (iterator.hasNext()){
                System.out.println("监听到select 的key就绪...");
                selectionKey = iterator.next();
                System.out.println(selectionKey);
//                iterator.remove();
                System.out.println(selectionKey);
                if (selectionKey.isConnectable()) {
                      System.out.println("客户端开始连接了...");
                      client = (SocketChannel) selectionKey.channel();
                      if (client.isConnectionPending()){
                          client.finishConnect();
                          System.out.println("客户端完成连接了...");
                          //完成连接了开始发数据
                          sendBuffer.clear();
                          sendBuffer.put("hello, server,I am client".getBytes());
                          sendBuffer.flip();
                          System.out.println("客户端开始发数据啦");
                          client.write(sendBuffer);
                          //注册自己的读事件
                          client.register(selector,SelectionKey.OP_READ);
                      }
                      //处理自己的读时间
                }else if (selectionKey.isReadable()) {
                      System.out.println("数据可以读了...");
                      client = (SocketChannel) selectionKey.channel();
                      receiveBuffer.clear();
                      int count = client.read(receiveBuffer);
                      if (count > 0) {
                          receiveText = new String(receiveBuffer.array(),0,count);
                          System.out.println("客户端收到服务端发送过来的数据: " + receiveText);
                      }
                      //然后注册自己的写事件
                      client.register(selector,SelectionKey.OP_WRITE);
                }else if (selectionKey.isWritable()) {
                      System.out.println("客户端开始写数据了...");
                      client = (SocketChannel) selectionKey.channel();
                      sendText = "来自客户端的消息..." + flag++;
                      sendBuffer.clear();
                      sendBuffer.put(sendText.getBytes());
                      sendBuffer.flip();
                      client.write(sendBuffer);
                      System.out.println("客户端发送消息完成: "+ sendText);
                      //写完了又要注册读事件 ???TODO
                      client.register(selector,SelectionKey.OP_READ);
                }
            }
            selectionKeys.clear();
        }
    }
}
