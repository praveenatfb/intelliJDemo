package com.coreplus;

class Account{
	private int balance=200;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance=balance-amount;
	}
}

public class AccountDemo implements Runnable {
	private Account acct=new Account();

	public static void main(String[] args) {
		AccountDemo ad=new AccountDemo();
		Thread one=new Thread(ad);
		Thread two=new Thread(ad);
		Thread three=new Thread(ad);
		one.setName("john");
		two.setName("danny");
		three.setName("saam");
		one.start();
		two.start();
		three.start();
	}
	public void run() {
		for(int i=0;i<3;i++) {
			makeWithDrawal(100);
			if(acct.getBalance()<0) {
				System.out.println("account bal is overdrwan");
			}
		}
	}
	private synchronized void makeWithDrawal(int amt) {
		if(acct.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+"is going to withdrawal");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+"completes the withdrawal");
		}else {
			System.out.println("not enough amount to withdraw to"+Thread.currentThread().getName()+acct.getBalance());
		}
	}

}
