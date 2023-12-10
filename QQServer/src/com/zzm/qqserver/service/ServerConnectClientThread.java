package com.zzm.qqserver.service;

import com.zzm.qqcommon.Message;
import com.zzm.qqcommon.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
                // 后面会使用message，根据message的类型，做相应的业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    // 客户端要在线用户列表
                    /*
                    在线用户列表形式 100 200 紫霞仙了
                     */
                    System.out.println(message.getSender() + " 要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    // 返回message
                    // 构建一个Message 对象，返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    // 返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);
                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {// 客户端退出
                    System.out.println(message.getSender() + " 退出");
                    // 将这个客户端对应线程，从集合删除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();// 关闭连接
                    // 退出线程
                    break;
                } else {
                    System.out.println("是其他类型的message，暂时不处理...");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
