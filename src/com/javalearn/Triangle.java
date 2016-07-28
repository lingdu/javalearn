package com.javalearn;

class Triangle
{
	int a;
	int b;
	int c;
	//通过自定义的构造器对该实例对象进行赋值
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	int zhouchang() //不需要定义形参，因为zhouchang函数和属性a b c是一个有机整体，彼此当然可以相互访问
	{
		return a + b + c;
	}
	
	double area() 
	{
		double p = 1.0*(a+b+c) / 2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	
	public static void main(String[] args)
	{	
//		
//		Triangle * r = (Triangle * )malloc(sizeof(Triangle));
		Triangle s = new Triangle(3, 4, 5);
		
		System.out.printf("周长是：%d\n面积是：%f\n", s.zhouchang(), s.area());
						//在java中double 和 float 都用%f输出
						//在C中,double用%lf输出, float 用%f输出	
	}
};
