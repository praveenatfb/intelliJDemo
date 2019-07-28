package com.coreplus;

class ThreadB extends Thread{
	int total;
	public void run() {
		synchronized (this) {
		for(int i=0;i<100;i++) {
			total +=i;
		}
		notify();
	}
}
}

public class ThreadA {

	public static void main(String[] args) {
		ThreadB t=new ThreadB();
		ThreadB t1=new ThreadB();
		t.start();
		t1.start();
		synchronized(t) {
			try {
				System.out.println("waiting for b to complete");
				t.wait();
			} catch (InterruptedException e) {
				System.out.println("total is"+t.total);	
				}
		}
	}

}
