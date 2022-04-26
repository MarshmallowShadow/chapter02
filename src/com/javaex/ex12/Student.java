package com.javaex.ex12;

public class Student extends Person{
	String schoolName;
	
	public Student() { }
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
}
