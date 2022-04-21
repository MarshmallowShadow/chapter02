package com.javaex.ex04;

public class Goods {
	private String name;
	private int price;
	
	Goods(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void printData() {
		System.out.println("제품: " + name + ", 가격: W" + price);
	}
}
