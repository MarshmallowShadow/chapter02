package com.javaex.ex14;

public class ShapeApp {
	public static void main(String[] args) {
		Shape[] s = new Shape[6];
		
		s[0] = new Rectangle("빨강", "검정", 4, 4);
		s[1] = new Rectangle("주황", "검정", 5, 5);
		s[2] = new Triangle("빨강", "검정", 4, 4);
		s[3] = new Triangle("보라", "검정", 10, 10);
		s[4] = new Circle("보라", "빨강", 3);
		s[5] = new Circle("보라", "검정", 3);
		
		for(int i=0; i<s.length; i++) {
			s[i].draw();
		}
	}
}
