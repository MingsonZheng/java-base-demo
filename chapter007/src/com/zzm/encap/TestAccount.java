// 封装练习
package com.zzm.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jackhahaha");
        account.setBalance(6);
        account.setPwd("123");

        account.showInfo();
    }
}
