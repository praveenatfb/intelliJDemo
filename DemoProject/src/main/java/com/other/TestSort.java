package com.other;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sachin");
		al.add("rohit");
		al.add("yuvraj");
		al.add("sourav");
		al.add("Dravid");
		System.out.println("unsorted array:"+al);
		Collections.sort(al);
		System.out.println("sorted array"+al);
	}

}
