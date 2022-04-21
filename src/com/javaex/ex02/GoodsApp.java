package com.javaex.ex02;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods("니콘", 400000);
		Goods laptop = new Goods("LG 그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		camera.print();
		laptop.print();
		cup.print();
	}
}
