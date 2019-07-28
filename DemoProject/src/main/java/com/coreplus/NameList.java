package com.coreplus;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
	private List names=Collections.synchronizedList(new LinkedList());
	public void add(String name) {
		names.add(name);
		}
	public String removeName() {
		if(names.size()>0)
			return (String)names.remove(0);
		else
			return null;
		}
	
	public static void main(String[] args) {
		final NameList nl=new NameList();
		nl.add("salmaan khan");
		class NameDroper extends Thread{
			public void run() {
				String name=nl.removeName();
				System.out.println(name);
			}
		}
			Thread t=new NameDroper();
			Thread t1=new NameDroper();
			t.start();
			t1.start();
	}
	}

