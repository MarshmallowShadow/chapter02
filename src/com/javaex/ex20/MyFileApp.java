package com.javaex.ex20;
import java.io.IOException;

public class MyFileApp {
	public static void main(String[] args) {

		MyFile mf = new MyFile();
		
		String str = mf.read("myFile.txt");
		System.out.println(str);
		
		System.out.println(mf.read2("어쩌구"));
		
		try {
			mf.read3("myfile.txt");
		} catch (IOException e) {
			System.out.println("===========================");
			System.out.println("        파일이 없습니다.       ");
			System.out.println("===========================");
		}
	}
}