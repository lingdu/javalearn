package com.javastruct;

public class ArrBiTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,level;
		int data[] = {6,3,5,9,7,8,4,2};
		int btree[]= new int[16];
		
		for (i=0; i<16;i++){
			btree[i] = 0;
		}
		
		System.out.println("原始数组的内容：");
		for (i=0; i<8; i++){
			System.out.print("["+data[i]+"] ");
		}
		System.out.println();
		
		for (i=0; i<8; i++){
			for(level=1; btree[level]!=0;){
				if (data[i] > btree[level]){
					level = level*2+1;
				}
				else {
					level = level*2;
				}
			}
			btree[level] = data[i];
		}
		System.out.print("二叉树的内容：\n");
		for (i=1; i<16; i++){
			System.out.print("["+btree[i]+"] ");
		}
		System.out.print("\n");
	}

}
