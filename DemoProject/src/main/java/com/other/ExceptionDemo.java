package com.other;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf=new RandomAccessFile("my.file.txt","r");
			byte b[]=new byte[1000];
			raf.readFully(b, 0, 1000);
			
		}catch(FileNotFoundException e) {
			System.err.println("file not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}catch(IOException e) {
			System.err.println("IO error");
			System.err.println(e.toString());
			e.printStackTrace();
			
		}
		
	}

}
