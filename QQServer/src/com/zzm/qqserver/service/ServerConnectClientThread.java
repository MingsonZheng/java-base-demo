package com.zzm.qqserver.service;

import com.zzm.qqcommon.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author Mingson
 * @version 1.0
 * 该类的一个对象和某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread {

    private Socket socket;
    private String userId;// 连接到服务端的用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {// 这里线程处于run的状态，可以发送/接收消息super.run();

        while (true) {
            try {
                System.out.println("服务端和客户端" + userId + " 保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                // 后面会使用message
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
