package com.javalearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSameStr {
	
	public String removeKZeros(String str, int k){
		
		if (str == null || k < 1){
			return str;
		}
		
		char[] chas = str.toCharArray();
		int count = 0; //表示连续 0 的个数
		int start = -1; //表示字符 0 开始的位置，初始值设为-1，表示还没有字符 0 出现
		
		for (int i = 0; i != chas.length; i++){
			if (chas[i] == '0'){
				count++;
				start = start == -1 ? i : start;
			}
			else{
				if (count == k){
					while (count-- != 0){
						chas[start++] = 0;
						
					}
					count = 0;
					start = -1;	
				}
			
			}
			if (count == k){
				while (count-- != 0){
					chas[start++] = 0;
					
				}
			}
		
		}
		return String.valueOf(chas);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
/*		System.out.println("请输入字符串：");
		String str1 = buf.readLine();
		System.out.println("请输入整数K：");
		int k1 = Integer.parseInt(buf.readLine());*/
		
		String str2 ="a0000b000";
		int k2 = 4;
		
		RemoveSameStr remzero = new RemoveSameStr();
		
		System.out.println(remzero.removeKZeros(str2, k2));
		

	}

}

