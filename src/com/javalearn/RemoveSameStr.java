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
		int count = 0; //��ʾ���� 0 �ĸ���
		int start = -1; //��ʾ�ַ� 0 ��ʼ��λ�ã���ʼֵ��Ϊ-1����ʾ��û���ַ� 0 ����
		
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
/*		System.out.println("�������ַ�����");
		String str1 = buf.readLine();
		System.out.println("����������K��");
		int k1 = Integer.parseInt(buf.readLine());*/
		
		String str2 ="a0000b000";
		int k2 = 4;
		
		RemoveSameStr remzero = new RemoveSameStr();
		
		System.out.println(remzero.removeKZeros(str2, k2));
		

	}

}

