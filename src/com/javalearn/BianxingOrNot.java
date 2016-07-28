/*
 * Author：lingdu
 * Date：2016.07.21
 * */

package com.javalearn;

import java.io.*;

public class BianxingOrNot {
	
	public boolean ifDeformation (String str1, String str2){
		
		if (str1 == null ||str2 == null || str1.length() != str1.length()){
			return false;
		}
		
		int[] map = new int[256]; //申请一个长度为256的整形数组 map
		char[] chas1 = str1.toCharArray();
		char[] chas2 = str2.toCharArray();
		
		for (int i=0; i < chas1.length; i++){
			map[chas1[i]]++;
		}
		
		for (int j=0; j < chas2.length; j++){
			map[chas2[j]]--;
			if (map[chas2[j]] < 0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String str1 = "1234";
		//String str2 = "4231";

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("请输入要比较的字符串1:");
		String str3 = buf.readLine();
		System.out.println("请输入要比较的字符串2:");
		String str4 = buf.readLine();
		
		BianxingOrNot bianxing = new BianxingOrNot();
		if (bianxing.ifDeformation(str3, str4)){
			System.out.println("二者互为变形词");
		}
		else{
			System.out.println("两个字符串不是变形词");
		}

	}

}
