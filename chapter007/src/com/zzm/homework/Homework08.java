// 作业
package com.zzm.homework;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);// 1010 - 1 = 1009
        checkingAccount.withdraw(9);// 1009 - 9 - 1 = 999;
        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());// 1300
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());// 1399

        // 月初，定时器自动调用一下 earnMonthlyInterest
        savingAccount.earnMonthlyInterest();// 统计利息
        System.out.println(savingAccount.getBalance());// 1399 + 13.99 = 1412.99
        savingAccount.withdraw(100);// 免手续
        System.out.println(savingAccount.getBalance());// 1412.99 - 100 = 1312.99
        savingAccount.withdraw(100);// 免手续
        savingAccount.withdraw(100);// 免手续
        System.out.println(savingAccount.getBalance());// 1312.99 - 200 = 1112.99
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());// 1112.99 + 100 - 1 = 1211.99
    }
}
