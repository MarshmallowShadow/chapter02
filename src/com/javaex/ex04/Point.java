package com.javaex.ex04;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	Point() {}
	Point(int x) {
		this.x = x;
		this.y = 0;
	}
	Point(int x, int y) {
		this(y);
		this.y = y;
	}
	
	//메소드 (get,set)
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//메소드 일반
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	public void draw(boolean isDraw) {
		if(isDraw) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
	
	public void delete() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
	}
	
}
