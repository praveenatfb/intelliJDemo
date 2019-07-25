package com.coreplus;

class MyThread extends Thread{
	public void run() {
		System.out.println("Mythread running");
	}
}
class MyRunnable implements Runnable{
	public void run() {
		
		System.out.println("Myrunnable method");
	}
}
class MyRunnable1 implements Runnable{
	public MyRunnable1(String string) {
	}
	public void run() {
		run("name");
		System.out.println("iside the runnable1");
	}
//start ignores the parameterised run method
	public void run(String s) {
		System.out.println(s);
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
		
		MyRunnable my=new MyRunnable();
		Thread m1=new Thread(my);
		Thread mn=new Thread(my);
		m1.start();
		mn.start();

		MyRunnable1 obj=new MyRunnable1("name");
		Thread mu=new Thread(obj);
		mu.start();
	}

}
