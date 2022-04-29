package com.javaex.ex19;

public class Ex02 {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 3;
		intArray[2] = 3;
		
		try{
			System.out.println(intArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("FAILURE: array unreachable");
		}
	}
}
