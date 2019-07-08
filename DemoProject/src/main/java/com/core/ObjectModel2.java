package com.core;

/*class Object2{
	String name="using new instance creating object";
}*/
public class ObjectModel2 {
	String name="using new instance creating object";

	public static void main(String[] args) {
		try {
		Class cls=Class.forName("ObjectModel2");
		ObjectModel2 obj=(ObjectModel2)cls.newInstance();
		System.out.println(obj.name);
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	}
	}
}
