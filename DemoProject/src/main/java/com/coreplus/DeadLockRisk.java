package com.coreplus;

public class DeadLockRisk {
	private static class Resource{
		public int value;
	}
	private Resource resourceA=new Resource();
	private Resource resourceB=new Resource();
	public int read() {
		synchronized(resourceA){
			synchronized(resourceB){
				return resourceA.value+resourceB.value;
			}
		}
	}
	public void write(int a,int b) {
		synchronized(resourceA){
			synchronized(resourceB){
				resourceA.value = a;
				resourceB.value = b;
				System.out.println(resourceA.value);
				System.out.println(resourceB.value);
			}
		}
	}

	public static void main(String[] args) {
		DeadLockRisk d=new DeadLockRisk();
		d.read();
		d.write(2,5);
	}

}
