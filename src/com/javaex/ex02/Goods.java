package com.javaex.ex02;

public class Goods {
	String name;
	int price;
	
	Goods(String name) {
		this.name = name;
	}
	Goods(String name, int price) {
		this(name);
		this.price = price;
	}
	
	public void print() {
		System.out.println("Name: " + name + " (" + price + ")");
	}
}
