package com.javaex.ex17;

public class ShapeApp {
	public static void main(String[] args) {
		Drawable[] d = new Drawable[8];
		
		Rectangle r = new Rectangle("빨강", "검정", 100, 100);
		
		Rectangle r01 = new Rectangle("빨강", "검정", 4, 4);
		Rectangle r02 = new Rectangle("주황", "검정", 5, 5);
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		Point p01 = new Point();
		Point p02 = new Point(6,9);
		
		d[0] = r01;
		d[1] = r02;
		d[2] = t01;
		d[3] = t02;
		d[4] = c01;
		d[5] = c02;
		d[6] = p01;
		d[7] = p02;
		
		for(int i=0; i<d.length; i++) {
			d[i].draw();
		}
	}
}
