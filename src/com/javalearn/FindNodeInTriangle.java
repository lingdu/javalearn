package com.javalearn;

public class FindNodeInTriangle {

	public static boolean isInside1(double x1, double y1, double x2, double y2, 
			double x3, double y3, double x, double y){
		double area1 = getArea(x1, y1, x2, y2, x, y);
		double area2 = getArea(x1, y1, x3, y3, x, y);
		double area3 = getArea(x2, y2, x3, y3, x, y);
		
		double allArea = getArea(x1, y1, x2, y2, x3, y3);
		return area1 + area2 + area3 <= allArea;
	}
	
	public static double getArea(double x1, double y1, double x2, double y2,
			double x3, double y3) {
		// TODO Auto-generated method stub
		double side1 = getSideLength(x1, y1, x2, y2);
		double side2 = getSideLength(x1, y1, x3, y3);
		double side3 = getSideLength(x2, y2, x3, y3);
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt((p - side1) * (p - side2) * (p - side3) * p);
	}

	private static double getSideLength(double x1, double y1, double x2, 
			double y2) {
		// TODO Auto-generated method stub
		double a = Math.abs(x1 - x2);
		double b = Math.abs(y1 - y2);
		return Math.sqrt(a*a + b*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = -5;
		double y1 = 0;
		double x2 = 0;
		double y2 = 8;
		double x3 = 5;
		double y3 = 0;
		double x = 0;
		double y = 5;
		
		if (isInside1(x1, y1, x2, y2, x3, y3, x, y)){
			System.out.println("坐标点位于三角形内");
		}
		
		System.out.println("坐标点不在三角形内部");
		
		}

}
