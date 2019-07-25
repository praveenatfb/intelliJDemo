package com.other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		try
		{
		Path p=Paths.get("file1.txt");
		System.out.println(Files.exists(p));
	//	Path longer=FileSystems.getDefault().getPath("temp", "file1.txt");
		Files.createFile(p);
		System.out.println(Files.exists(p));
		/*}catch(IOException e){
		}
		try {*/
		Path path=Paths.get("/home/fedora/gaffarsoftwares/eclipse/workspace");
		System.out.println(Files.exists(path));
		
		Path path1=Paths.get("/home/fedora/gaffarsoftwares/eclipse/workspace");
		Path file=Paths.get("/home/fedora/gaffarsoftwares/eclipse/workspace/PathDemo.java");
		Files.createDirectory(path);
		Files.createDirectory(path1);
		Files.createFile(file);
		System.out.println(Files.isDirectory(path1));
		System.out.println(Files.exists(file));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
