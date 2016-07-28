package com.javalearn;

class Student{
	public static int cnt = 0;
	private String sname;
	private int sage;
	public Student(){
		cnt++;		
	}
	public Student(String name, int age) {
		this.sname = name;	this.sage =  age;		cnt++;
	}
}

class StaticMethod
{
	public static int i;
	public int j;
	
	public static int f()
	{
		//g();  //error ��̬�������ܷ��ʷǾ�̬����
		i = 10; //OK
		//j = 99;  //error  ��̬�������ܷ��ʷǾ�̬����
		System.out.println("i =" + i);
		return i;
	}
	
	public void g()
	{
		f();  //OK
		i = 20;  //OK
		System.out.println("i =" + i);
		System.out.println("f()=" + f());
	}
}

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student.cnt = " + Student.cnt );
		Student st1 = new Student("zhangsan", 20);
		Student st2 = new Student("lisi", 30);
		System.out.printf("Student���ܹ�������%d������!\n", Student.cnt);
		
		StaticMethod method = new StaticMethod();
		method.g();
		
		
		

	}

}
