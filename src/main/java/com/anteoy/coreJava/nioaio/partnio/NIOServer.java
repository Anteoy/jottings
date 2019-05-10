package com.anteoy.coreJava.nioaio.partnio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @auther zhoudazhuang
 * @date 19-5-9 18:27
 * @description
 */
public class NIOServer {
    private int bufferSize = 4096;
    private Selector selector;
    private ByteBuffer receiveBuffer = ByteBuffer.allocate(bufferSize);
    private ByteBuffer sendBuffer = ByteBuffer.allocate(bufferSize);
    private  int flag = 1;
    private int port;

    NIOServer (int port) throws IOException {
        this.port = port;
        selector = Selector.open();
    }

    //监听
    public void listen() throws IOException {
        //实例化一个信道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //将该信道绑定到指定端口
        serverSocketChannel.socket().bind(new InetSocketAddress("127.0.0.1", 8080));
        //配置信道为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        //将选择器注册到各个信道
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("server channel 注册到8080完成...");
        while(true){
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                System.out.println("监听到select 的key就绪...");
                SelectionKey selectionKey = iterator.next();
                iterator.remove();
                //业务逻辑
                handleKey(selectionKey);
            }
        }

    }

    void handleKey(SelectionKey selectionKey) throws IOException {
        ServerSocketChannel serverSocketChannel = null;
        SocketChannel socketChannel = null;
        String receiveText = null;
        String sendText;
        int count = 0;
        if (selectionKey.isAcceptable()) {
            System.out.println("进入 key acceptable...");
            //服务端
            serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
            //客户端
            socketChannel = serverSocketChannel.accept();
            System.out.println("已经accept...");
            socketChannel.configureBlocking(false);
            socketChannel.register(selector,SelectionKey.OP_READ);
        }else if(selectionKey.isReadable()){
            //客户端channel
            socketChannel = (SocketChannel) selectionKey.channel();
            socketChannel.getRemoteAddress();
            count = socketChannel.read(receiveBuffer);
            //从缓冲区取出来
            if (count > 0) {
                receiveText = new String(receiveBuffer.array(),0,count);
            }
            System.out.println("服务端接收到客户端的信息: " + receiveText);
            //客户端注册写事件
            socketChannel.register(selector, SelectionKey.OP_WRITE);
        }else if (selectionKey.isWritable()) {
            sendBuffer.clear();
            socketChannel = (SocketChannel) selectionKey.channel();
            sendText = "服务端发送消息: " + flag++;
            sendBuffer.put(sendText.getBytes());
            sendBuffer.flip();
            //把缓冲区的数据发送出去
            socketChannel.write(sendBuffer);
            System.out.println("服务端发送数据: " + flag++);
        }
    }

    public static void main(String[] args) throws IOException {
        NIOServer nioServer = new NIOServer(8080);
        nioServer.listen();
    }
}
