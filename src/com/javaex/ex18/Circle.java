package com.javaex.ex18;

public class Circle extends Shape implements Drawable {
	private int radius;
	
	public Circle() { 
		super();
		radius = 1;
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle[fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + ", width="
				+ radius + "]";
	}
	public void draw() {
		System.out.println("[면색:" + super.getFillColor() + ", 선색:" + super.getLineColor() + ", 반지름:" + radius + "] 원을 그렸습니다.");
	}
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
