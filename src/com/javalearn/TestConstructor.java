package com.javalearn;

/*
函数名与类名相同的函数用法
*/

class TestConstructor{
	private int i;

//这不是构造函数，创建类对象时是不会自动被调用的,与16行的A函数构成重载
	public void TestConstructor(int m){
		i = 11111;
		System.out.println("调用了有参的函数");			 
	}
	
	//将本函数注释掉 则输出结果是 ： i = 0, 如果本函数不被注释掉， 则输出结果是: i = 10
	public TestConstructor() {		   
		this.i = 10;
	}

	//这不是构造函数，创建类对象时是不会自动被调用的,与6行的A函数构成重载
	public int TestConstructor() {
		i = 22222;
		System.out.println("调用了无参的函数");
		return 888;
	}

	public void shout(){
		System.out.println("i = " + i);
	}


public static class TestCons{

	public static void main(String[] args){
		TestConstructor ra = new TestConstructor();
		ra.shout();
		
		ra.TestConstructor();
		ra.TestConstructor(1);
		}
	}

}

/*
在JDK 1.8中的运行结果是：
----------------------
i = 10
调用了无参的函数
调用了有参的函数
----------------------
总结：
	在一个类中可以定义多个函数名与类名相同但却有返回值的函数，
	返回值为void 或int 或 double都可以，这些有返回值的函数只要
	能满足重载特点，就可以同时存在一个类中,不过要注意：这些有返回值的
	函数(包括返回值为void的函数)都不是构造函数，都不会被类对象自动调用

	当然也可以定义多个没有任何返回值的函数，注意连void都不可以加，
	这些函数才是构造函数
*/

