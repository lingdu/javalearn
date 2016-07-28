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
		
		System.out.println("请输入5个学生数据");
		LinkList list = new LinkList();
		
		for (int i=1; i<6; i++){
			
			System.out.printf("请输入学号：");
			num = Integer.parseInt(buf.readLine());
		    System.out.printf("请输入姓名：");
		    name = buf.readLine();
		    System.out.printf("请输入成绩：");
		    score = Integer.parseInt(buf.readLine());
		    list.insert(score, name, num);
		    System.out.println("-------------------");
		}
		
		System.out.println("学生数据—————————————————————");
		list.print();
	

	}

}
