package com.zzm.qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Mingson
 * @version 1.0
 * 该类用于管理和客户端通信的线程
 */
public class ManageClientThreads {

    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    // 添加线程对象到 hm 集合
    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId, serverConnectClientThread);
    }

    // 根据userId 返回ServerConnectClientThread线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }

    // 这里编写方法，可以返回在线用户列表
    public static String getOnlineUser() {
        // 集合遍历 ，遍历 hashmap的key
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUserList = "";
        while (iterator.hasNext()) {
            onlineUserList += iterator.next().toLowerCase() + " ";
        }
        return onlineUserList;
    }
}
