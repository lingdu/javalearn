package com.javalearn;

class Triangle
{
	int a;
	int b;
	int c;
	//ͨ���Զ���Ĺ������Ը�ʵ��������и�ֵ
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	int zhouchang() //����Ҫ�����βΣ���Ϊzhouchang����������a b c��һ���л����壬�˴˵�Ȼ�����໥����
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
		
		System.out.printf("�ܳ��ǣ�%d\n����ǣ�%f\n", s.zhouchang(), s.area());
						//��java��double �� float ����%f���
						//��C��,double��%lf���, float ��%f���	
	}
};
