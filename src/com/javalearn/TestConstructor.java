package com.javalearn;

/*
��������������ͬ�ĺ����÷�
*/

class TestConstructor{
	private int i;

//�ⲻ�ǹ��캯�������������ʱ�ǲ����Զ������õ�,��16�е�A������������
	public void TestConstructor(int m){
		i = 11111;
		System.out.println("�������вεĺ���");			 
	}
	
	//��������ע�͵� ���������� �� i = 0, �������������ע�͵��� ����������: i = 10
	public TestConstructor() {		   
		this.i = 10;
	}

	//�ⲻ�ǹ��캯�������������ʱ�ǲ����Զ������õ�,��6�е�A������������
	public int TestConstructor() {
		i = 22222;
		System.out.println("�������޲εĺ���");
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
��JDK 1.8�е����н���ǣ�
----------------------
i = 10
�������޲εĺ���
�������вεĺ���
----------------------
�ܽ᣺
	��һ�����п��Զ�������������������ͬ��ȴ�з���ֵ�ĺ�����
	����ֵΪvoid ��int �� double�����ԣ���Щ�з���ֵ�ĺ���ֻҪ
	�����������ص㣬�Ϳ���ͬʱ����һ������,����Ҫע�⣺��Щ�з���ֵ��
	����(��������ֵΪvoid�ĺ���)�����ǹ��캯���������ᱻ������Զ�����

	��ȻҲ���Զ�����û���κη���ֵ�ĺ�����ע����void�������Լӣ�
	��Щ�������ǹ��캯��
*/

