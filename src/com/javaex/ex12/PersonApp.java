package com.javaex.ex12;

public class PersonApp {
	public static void main(String[] args) {
		Person p01 = new Person("Marsh", 26);
		Student s01 = new Student("shad", 26, "ITGlobal");
		
		p01.showInfo();
		System.out.println(s01.toString());
	}
}
