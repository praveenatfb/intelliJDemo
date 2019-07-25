package com.coreplus;

class NameThread1 extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("NameThread is"+Thread.currentThread().getName()+"x is"+i);
		}
	}
}

class NameRunnable implements Runnable{
	public void run() {
		System.out.println("Name Runnable is running");
		System.out.println("Runby" +Thread.currentThread().getName());
	}
}

public class NameThread {

	public static void main(String[] args) {
		NameRunnable nr=new NameRunnable();
		Thread t=new Thread(nr);
		t.start();
		t.setName("saam");
		
		System.out.println("this is"+Thread.currentThread().getName());
		
		NameThread1 nt=new NameThread1();
		nt.setName("rick");
		nt.start();
		
	}

}
