package com.core;



public class StringDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Rock");
		sb.append("star");
		System.out.println(sb);
		String s="mohd";
		String s1=s+"gafar";
		System.out.println(s);
		System.out.println(s1);
		String m=new String("saam is actress");
		System.out.println(m);
		System.out.println(m.charAt(6));
		System.out.println(m.concat("in telugu"));
		System.out.println(m.length());
		System.out.println(m.substring(4, 10));
		System.out.println(m.toUpperCase());
		System.out.println(m.replace("saam", "rakul"));
		
	}

}
