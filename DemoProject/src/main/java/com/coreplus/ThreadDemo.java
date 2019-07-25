package com.coreplus;

class Sample extends Thread{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("Thread sample");
		}
	}
	
}
class Sample1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread Sample1:");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.start();
		Sample1 s1=new Sample1();
		s1.start();
	}

}
