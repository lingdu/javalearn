package com.javastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String name;
		int score;
		
		System.out.println("������5��ѧ������");
		LinkList list = new LinkList();
		
		for (int i=1; i<6; i++){
			
			System.out.printf("������ѧ�ţ�");
			num = Integer.parseInt(buf.readLine());
		    System.out.printf("������������");
		    name = buf.readLine();
		    System.out.printf("������ɼ���");
		    score = Integer.parseInt(buf.readLine());
		    list.insert(score, name, num);
		    System.out.println("-------------------");
		}
		
		System.out.println("ѧ�����ݡ�����������������������������������������");
		list.print();
	

	}

}
