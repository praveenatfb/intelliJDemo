package com.coreplus;

class Simple implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Thread Simple");
		}
	}
}
class Simple1 implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Thread Simple1");
		}
	}
}

public class Thread1Demo {

	public static void main(String[] args) {
		Simple s=new Simple();
		Simple1 s1=new Simple1();
		Thread t=new Thread(s);
		Thread t1=new Thread(s1);
		t.start();
		t1.start();
	}

}
