package com.company.ch13.bin;

public class Ex13_12_12 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();  //ThreadGroup에 의해 참조되므로 gc의 대상이 아니다.
        new Thread(r).start();
    }
    
}

class Account {
    private int balance = 1000;
    
    public int getBalance() {
        return balance;
    }
    
    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e ){}
            balance -= money;
        }
    }//withdraw
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();
    
    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            //100, 200, 300중에 한 값을 임으로 선택해서 출금합니다.
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("잔액:" + acc.getBalance());
        }
    }//run
}




















