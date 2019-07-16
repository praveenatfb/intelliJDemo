package com.other;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		char []in=new char[50];
		File file=new File("fileWriter.txt");
		try {
		FileWriter fw=new FileWriter(file);
		
		PrintWriter pw=new PrintWriter(fw);
		pw.print("shaik");
		pw.flush();
		pw.close();
		FileReader fr=new FileReader(file);
		int size=fr.read(in);
		System.out.println(size);
		for(char c:in) {
			System.out.print(c);
		}
		}catch(IOException e) {
			
		}
		
	}

}
