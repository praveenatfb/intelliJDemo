package com.other;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryDemo {

	public static void main(String[] args) {
		File myDir=new File("mydir");
		myDir.mkdir();
		System.out.println(myDir.isDirectory());
		File file=new File(myDir,"File.txt");
		System.out.println(file.isFile());
		try {
			PrintWriter pw=new PrintWriter(file);
			pw.write("Rockstar");
			pw.flush();
			pw.close();
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
				br.close();
			}
			//myFile.createNewFile();
			//myFile.canWrite();//Write("new stuff");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
