package com.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {
		Drawable[] d = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "검정", 100, 100);
		Drawable t01 = new Triangle("빨강", "검정", 4, 4);
		Drawable c01 = new Circle("보라", "검정", 3);
		Drawable p01 = new Point(8,8);
		
		d[0] = r01;
		d[1] = t01;
		d[2] = c01;
		d[3] = p01;
		
		for(int i=0; i<d.length; i++) {
			d[i].draw();
		}
	}
}
