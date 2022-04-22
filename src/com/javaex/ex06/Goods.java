package com.javaex.ex06;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	Goods(){}
	Goods(String name){
		this.name = name;
	}
	Goods(String name, int price) {
		this(name);
		this.price = price;
	}
	
	//메소드 (get, set)
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반 html(2일)
	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + "]";
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
	}
	
	
}
