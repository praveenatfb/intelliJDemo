package com.other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		char []in=new char[50];
		File file=new File("BufferWriter.txt");
		try {
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("my world of java");
		bw.append("is here");
		bw.flush();
		bw.close();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		System.out.println(data);
		
		}catch(IOException e) {
			
		}
	}

}
