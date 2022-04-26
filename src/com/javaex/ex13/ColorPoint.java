package com.javaex.ex13;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super();
	}
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("색깔: " + color);
	}
	
}
