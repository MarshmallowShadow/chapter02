package com.javaex.ex19;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double result;
		int num;
		
		num = sc.nextInt();
		
		try {
			
			result = 100/num;
			
			System.out.println(result);
			
		} catch(ArithmeticException e) {
			System.out.println("FAILURE: attempted to divide by zero");
		} finally {
			System.out.println("fuck off");
		}
		
		sc.close();
	}
}
