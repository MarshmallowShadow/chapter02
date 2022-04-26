package com.javaex.ex10;

public class Goods {
	private String name;
	private int price;
	public static int count;
	
	public Goods() {
		Goods.count = count+1;
	}
	public Goods(String name) {
		this.name = name;
		Goods.count = count+1;
	}
	public Goods(String name, int price) {
		this(name);
		this.price = price;
		Goods.count = count+1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		Goods.count = count+1;
	}
	
	@Override
	public String toString() {
		return "Goods[name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		System.out.println();
	}

}