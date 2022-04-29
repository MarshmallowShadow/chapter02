package com.javaex.ex19;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		try {
			System.out.println(str);
		} catch(NullPointerException e) {
			System.out.println("FAILURE: attempted to print null");
		}
		
		sc.close();
	}
}
