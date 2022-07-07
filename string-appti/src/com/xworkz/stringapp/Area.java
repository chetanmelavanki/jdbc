package com.xworkz.stringapp;

public class Area {
	public static void main(String[] args) {
		areaOfTriangle();
		areaOfSquare();
		areaOfRectangle();
		areaOfCircle();
	}

	public static void areaOfTriangle() {
		float b = 3, h = 6, area;
		area = (b * h) / 2;
		System.out.println("Area of Triangle is=" + area);
	}

	public static void areaOfSquare() {
		int s = 13;
		int area_square = s * s;
		System.out.println("Area of the square=" + area_square);

	}

	public static void areaOfRectangle() {
		int width = 4;
		int height = 5;
		int area = width * height;
		System.out.println("Area of rectangle=" + area);
	}
	public static void areaOfCircle() {
		int r=5;
        double pi = 3.14, area;
        area = pi * r * r;
        System.out.println("Area of circle="+area);
	}
}
