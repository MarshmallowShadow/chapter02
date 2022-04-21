package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
	}
}
