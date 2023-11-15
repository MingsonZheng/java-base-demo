// 作业
package com.zzm.homework;

// 在上面类的基础上扩展 新类CheckingAccount对每次存款和取款都收取1美元的手续费
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double balance) {
        super(balance);
    }

    // 存款
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);// 巧妙的使用了父类的 deposit
        // 1 块钱转入银行的账号
    }

    // 取款
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
        // 1 块钱转入银行的账号
    }
}
