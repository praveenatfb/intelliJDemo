package com.core;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("h");
		System.out.println(list);
		list.remove(0);
		list.remove("h");
		System.out.println(list);
		System.out.println(list.contains("h"));

	}

}
