package com.anteoy.coreJava.niotest;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * @auther zhoudazhuang
 * @date 19-5-8 21:20
 * @description
 */
public interface TCPProtocolHandle {
    //accept I/O形式
    void handleAccept(SelectionKey key) throws IOException;
    //read I/O形式
    void handleRead(SelectionKey key) throws IOException;
    //write I/O形式
    void handleWrite(SelectionKey key) throws IOException;
}
