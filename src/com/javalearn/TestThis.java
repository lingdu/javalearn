package com.javalearn;

class Athis
{
	private int i;
	public Athis(int i)
	{
		this.i = i;  //���β� i �����ù��췽�������������������Ǹ��¶����i���ݳ�Ա
	}
	public void show(){
		System.out.println("i = " + this.i);
			//this��ʾ��ǰʱ�����ڵ���show�����Ķ���
			//this����ʡ��
	}
}

class Athis2
{
	public int i;
	//ͨ���Զ��幹�캯���Գ�Ա������ֵ
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



