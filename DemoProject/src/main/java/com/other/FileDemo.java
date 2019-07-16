package com.other;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		boolean newFile=false;
		File f=new File("fileWriter.txt");
		System.out.println(f.exists());
		try {
			newFile = f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(newFile);
		System.out.println(newFile);
		System.out.println(f.exists());
	}

}
