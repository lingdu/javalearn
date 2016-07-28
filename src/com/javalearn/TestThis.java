package com.javalearn;

class Athis
{
	private int i;
	public Athis(int i)
	{
		this.i = i;  //将形参 i 赋给该构造方法本次运行所创建的那个新对象的i数据成员
	}
	public void show(){
		System.out.println("i = " + this.i);
			//this表示当前时刻正在调用show方法的对象
			//this可以省略
	}
}

class Athis2
{
	public int i;
	//通过自定义构造函数对成员变量赋值
	public Athis2(int j)
	{
		i = j;
	}
	
	public void show()
	{
		System.out.println("i = " + i);
	} 
}

public class TestThis
{
	public static void main(String[] args){
		Athis aa1 = new Athis(100);
		aa1.show();
		
		Athis aa2 = new Athis(200);
		aa2.show();
		
		Athis2 aa3 = new Athis2(5);
		Athis2 aa4 = new Athis2(8);
		aa3.show();
		aa4.show();
		
		
	}	
}



