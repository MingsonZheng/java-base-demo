package com.zzm.qqclient.service;

import com.zzm.qqcommon.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author Mingson
 * @version 1.0
 */
public class ClientConnectServerThread extends Thread {

    // 该线程需要持有Socket
    private Socket socket;

    // 构造器可以接受一个Socket对象
    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    // 为了更方便的得到Socket
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        // 因为Thread需要在后台和服务器通信，因此我们white循环
        while (true) {
            try {
                System.out.println("客户端线程，等待从读取从服务器端发送的消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                // 如果服务器没有发送Message对象，线程会阻塞在这里
                Message message = (Message) ois.readObject();
                // 注意，后面我们需要去使用message
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
