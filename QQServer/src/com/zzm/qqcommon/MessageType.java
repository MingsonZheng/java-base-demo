package com.zzm.qqcommon;

/**
 * @author Mingson
 * @version 1.0
 * 表示消息类型
 */
public interface MessageType {
    // 解读
    // 1. 在接口中定义了一些常量
    // 2. 不同的常量的值，表示不同的消息类型
    String MESSAGE_LOGIN_SUCCEED = "1";// 表示登陆成功
    String MESSAGE_LOGIN_FAIL = "2";// 表示登陆失败
}
