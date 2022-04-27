package com.javaex.ex15;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		width = 2;
		height = 1;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle[fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + ", width="
				+ width + ", height" + height + "]";
	}
	public void draw() {
		System.out.println("면색:" + super.getFillColor() + ", 선색:" + super.getLineColor() + ", 가로:" + width 
				+ ", 세로:" + height + " 사각형을 그렸습니다.");
	}
}
