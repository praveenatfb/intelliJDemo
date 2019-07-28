package com.coreplus;

import java.util.LinkedList;
import java.util.List;

 public class SyncTest{
	private List names=new LinkedList();
	public  synchronized void add(String name) {
		names.add(name);
	}
	public synchronized String removeFirst() {
		if(names.size()>0)
			return (String)names.remove(0);
		else
			return null;
	}

	public static void main(String[] args) {
		SyncTest st=new SyncTest();
		st.add("john");
		class NameDropper extends Thread{
			public void run() {
				String name=st.removeFirst();
				System.out.println(name);
			}
		}
		Thread t=new NameDropper();
		Thread t1=new NameDropper();
		t.start();
		t1.start();
		
	}

}
