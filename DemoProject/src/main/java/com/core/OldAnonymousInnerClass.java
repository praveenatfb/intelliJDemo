package com.core;

class PopCorn{
	public void pop() {
		System.out.println("Popcorn");
		
	}
}
 class Food {
	PopCorn p=new PopCorn() {
		public void pop() {
			System.out.println("Anonymous Inner class");
			
		}
	};
}

public class OldAnonymousInnerClass {

	public static void main(String[] args) {
		Food f=new Food();
		f.p.pop();
		PopCorn p=new PopCorn();
		p.pop();
	}

}
