package com.javaex.ex17;

public class Point implements Drawable {
	private int x;
	private int y;
	
	Point() {
		x = 0;
		y = 0;
	}
	Point(int x){
		this.x = x;
		y = 0;
	}
	Point(int x, int y){
		this(x);
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("[x=" + x + ", y=" + y + "] 점을 그렸습니다.");
	}
}
