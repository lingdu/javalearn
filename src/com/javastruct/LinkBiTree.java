package com.javastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkBiTree {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	      int ArraySize=10;
	      int tempdata;
	      int[] content=new int[ArraySize];
	      BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("请连续输入"+ArraySize+"个数据"); 
	      for(int i=0;i<ArraySize;i++) {
	      System.out.print("请输入第"+(i+1)+"个数据: ");       
	      tempdata=Integer.parseInt(keyin.readLine());
	      content[i]=tempdata;
	      }
	      new BinaryTree(content);
	      System.out.println("===以链表方式建立二叉树,成功!!!===");
	}

}
