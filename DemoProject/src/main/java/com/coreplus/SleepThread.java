package com.coreplus;

class ManyName implements Runnable{
	public void run() {
		System.out.println("ManyName class thread"+Thread.currentThread().getName());
		try {
			Thread.sleep( 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SleepThread {

	public static void main(String[] args) {
		ManyName mn=new ManyName();
		Thread t=new Thread(mn);
		Thread t1=new Thread(mn);
		Thread t2=new Thread(mn);
		t.setPriority( 8);
		t.setName("john");
		t1.setPriority( 3);
		t1.setName("ram");
		t2.setPriority( 10);
		t2.setName( "vicky");
		t.start();
		t1.start();
		t2.start();
	}

}
