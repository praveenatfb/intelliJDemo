package com.other;

class EqualityTest{
		EqualityTest(){
			System.out.println("inside class" +('a'=='a'));
			System.out.println('a'=='b');
			System.out.println(5!=6);
			System.out.println(5.0==5L);
			System.out.println(false==true);
		}
}

public class OperatorsDemo {

	public static void main(String[] args) {
		EqualityTest t=new EqualityTest();
		//Assignment operator
		int a=10,b=20,c=30,z;
		z=(a+b)+c;
		System.out.println(z);
		//compound assignment operators
		z+=a+b;
		System.out.println(z);
		z-=b-a;
		System.out.println(z);
		z*=a;
		System.out.println(z);
		z/=(a+b);
		System.out.println(z);
		//Relational operators
		if(a>b&a>=b) 
			System.out.println("a is greater than b");
			else
			System.out.println("b is greater than a");
		if(c<a+b&c<=a+b)
			System.out.println("c is greater");else
				System.out.println("(a+b) is greater");
		//Equality operators
		if(a!=0) {
			System.out.println(a==0);
		}
			
		}
			
	}


