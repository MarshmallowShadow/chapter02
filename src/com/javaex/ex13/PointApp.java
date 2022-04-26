package com.javaex.ex13;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(6,9);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(4, 2, "blue");
		
		p1.showInfo();
		cp1.showInfo();
		cp2.showInfo();
	}
}
