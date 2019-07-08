package com.core;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Object3 implements Serializable{
	private String name;
	Object3(String name){
		this.name=name;
	}
}

public class ObjectModel3 {

	public static void main(String[] args) {
		try {
		Object3 o3=new Object3("object creation using serializable");
		FileOutputStream f = new FileOutputStream("file.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(o3);
			obj.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
				}

}
