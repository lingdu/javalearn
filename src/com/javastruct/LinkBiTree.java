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
	      System.out.println("����������"+ArraySize+"������"); 
	      for(int i=0;i<ArraySize;i++) {
	      System.out.print("�������"+(i+1)+"������: ");       
	      tempdata=Integer.parseInt(keyin.readLine());
	      content[i]=tempdata;
	      }
	      new BinaryTree(content);
	      System.out.println("===������ʽ����������,�ɹ�!!!===");
	}

}
