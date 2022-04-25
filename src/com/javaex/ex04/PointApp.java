package com.javaex.ex04;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		
		Point p2 = new Point(10,23);
		
		Point p3 = new Point();
		p3.setX(10);
		p3.setY(20);
		
		Point p4 = new Point(100);
		p4.setY(200);
		
		p1.draw(true);
		p2.draw(true);
		p3.draw(true);
		
		p1.delete();
		p3.draw(false);
	}
}
