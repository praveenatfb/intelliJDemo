package com.other;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		String s="Hi";
		l.add("string");
		l.add(s);
		l.add(s+s);
		System.out.println(l.size());
		System.out.println(l.contains(12));
		System.out.println(l.contains("HiHi"));
		System.out.println(l);
		l.remove("Hi");
		System.out.println(l);
		
	}

}
