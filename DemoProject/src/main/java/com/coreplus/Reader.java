package com.coreplus;

 class Reader extends Thread {
	
	Calculator c;
	Reader(Calculator calc) {
		c=calc;
	}
	public void run() {
		try {
			System.out.println("waitig for calculator");
			c.wait();
		} catch (InterruptedException e) {
			System.out.println("total is :"+c.total);	
			}
	}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Thread(calculator).start();

	}

}
class Calculator implements Runnable{
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<3;i++) {
				total+=i;
			}
			notifyAll();
		}
	}
}
