package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods("니콘", 300000);
		Goods laptop = new Goods("LG그램", 1100000);
		Goods cup = new Goods("머그컵", 2000);
		
		camera.printData();
		laptop.printData();
		cup.printData();
	}
}
