package com.javaex.ex20;
import java.io.IOException;

public class MyFile {
	
	public MyFile() {
		
	}
	
	public String read(String path) {
		String result = "학교종이 땡떙땡";
		return result;
	}
	
	public String read2(String path) { //catch를 유형별로 여러개 넣어도 됨
		String result = "학교종이 땡떙땡";
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println(path + "no file");
		}
		return result;
	}
	
	public void read3(String path) throws IOException{
		String result ="";
		throw new IOException();
	}
}