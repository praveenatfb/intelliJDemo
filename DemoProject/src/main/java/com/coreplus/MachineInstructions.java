package com.coreplus;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.geom.Shape;

class Operator extends Thread{
	MachineInstructions machine;
	public void run() {
		while(true) {
			Shape shape=getShapeFromUser();
			MachineInstructions job=new MachineInstructions(shape);
			machine.addJob(job);
		}
	}
	private Shape getShapeFromUser() {
		return null;
	}
}

 class Machine extends Thread{
	List<MachineInstructions> jobs=new ArrayList<MachineInstructions>();
	public void addJob(MachineInstructions job) {
		synchronized(jobs) {
			jobs.add(job);
			jobs.notify();
		}
	}
	
	public void run() {
		while(true) {
			synchronized(jobs) {
				while(jobs.isEmpty()) {
					try {
						jobs.wait();
					}catch(InterruptedException e) {
						
					}
				}
			}
		}
	}
 }
	public class MachineInstructions{
	public MachineInstructions(Shape shape) {
	/*  Machine m=new Machine();
	 // Thread t=new Thread(m);
	  m.start();*/
	}

	public void addJob(MachineInstructions job) { 
		
	}

	public static void main(String[] args) {
		 Machine m=new Machine();
		 m.start();
	}
	}
	

