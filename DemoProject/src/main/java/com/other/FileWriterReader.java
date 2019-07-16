package com.other;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

	public static void main(String[] args) {
		char []in=new char[50];
		int size=0;
		File file=new File("FileWriter.txt");
		try {
		FileWriter fw=new FileWriter(file);
			fw.write("shaik\nmohammad\ngafar");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(file);
		size=fr.read(in);
		System.out.println(size);
		for(char c:in) {
			System.out.print(c);
			fr.close();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
