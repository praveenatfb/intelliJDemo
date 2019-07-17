package com.other;

import java.io.*;

public class DelDirDemo {

	public static void main(String[] args) {
		File myDir=new File("myDir");
		myDir.mkdir();
		System.out.println(myDir.isDirectory());
		try {
		File file=new File(myDir,"File.txt");
		System.out.println(file.isFile());
		file.createNewFile();
		File file1=new File(myDir,"File1.txt");
		file1.createNewFile();
		System.out.println(file1.isFile());
		System.out.println(myDir.listFiles());
		//deleting a file
		file1.delete();
		System.out.println(file1.isFile());
		System.out.println("myDir is"+myDir.delete());
		//rename a file
		File newName=new File(myDir,"newName.txt");
		file.renameTo(newName);
		System.out.println(newName.isFile());
		//rename a directory
		File newDir=new File("newDir");
		myDir.renameTo(newDir);
		System.out.println("newDir is a: "+newDir.isDirectory());
		//searching a file
		String[] files=new String[100];
		File search=new File("newDir");
		files=search.list();
		for(String fn:files) {
			System.out.println(fn);
		}
		}catch(IOException e){
			
		}
	}

}
