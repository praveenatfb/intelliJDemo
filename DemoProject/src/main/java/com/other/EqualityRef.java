package com.other;

import javax.swing.JButton;

class Budgie{
	
}

public class EqualityRef {

	public static void main(String[] args) {
		JButton j=new JButton("Exit");
		JButton b=new JButton("Exit");
		JButton l=j;
		System.out.println(j==b);
		System.out.println(j==l);
		
		String s1="Bob";
		String s2="Bob";
		String s3="bob";
		System.out.println("\n");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		Budgie b1=new Budgie();
		Budgie b2=new Budgie();
		Budgie b3=b1;
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
	}

}
