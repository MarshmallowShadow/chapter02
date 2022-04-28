package com.javaex.ex17;

public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		fillColor = "하양";
		lineColor = "검정";
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	@Override
	public String toString() {
		return "Shape[fillcolor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public abstract double area();
}
