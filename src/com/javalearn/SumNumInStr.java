package com.javalearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumInStr {
	
	
/*	int Num = 0; //��¼�����Ӵ��ĸ���
	int[] MumStr = new int[256]; //��¼ÿ�������Ӵ�����������,�����СΪ256
	
	public SumNumInStr(int n, int[] m){
		this.Num = n;
		this.MumStr = m;
	}*/
	
	public int numSum(String str){
		
		if (str == null){
			return 0;
		}
		
		char[] charArr = str.toCharArray();
		int res = 0; //��¼���յ�ͳ�ƽ��
		int num = 0; //��¼��ǰ���ռ����������Ӵ�
		boolean ptr = true; //��¼��ǰ���������ֵ�����״̬
		int cur = 0; //��¼��ǰ�����������ַ�
		int N = 0;
		int[] M = null;
		for (int i=0; i < charArr.length; i++){
			cur = charArr[i] - '0'; //����ǰ������ÿһ���ַ�ת����ascii���ʾ
			if (cur < 0 || cur > 9){
				res += num;
				if (num != 0){
					M[N++] = num;
				}
				
				num = 0;
				
				if (charArr[i] == '-'){
					if (i-1 > -1 && charArr[i-1] == '-'){
						ptr = !ptr; //��������������'--'ʱ��ptrΪ��
					}
					else{
						ptr = false; //������һ�� '-' ������ptrΪ��
					}
				}
				else{
					ptr = true; //��������� '-' ֮�����һ���ַ���������0-9������ptrΪ��
				}
			}
			else{
				num = num * 10 + (ptr ? cur : -cur);
			}
		}
		res += num;
		M[N++] = num;
		return res;
		//SumNumInStr(N, M[N]);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String str1 = "as12-3--4f7";
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������ַ�����");
		String str2 = buf.readLine();
		
		SumNumInStr sumnum = new SumNumInStr();
		System.out.println(sumnum.numSum(str2));
		//System.out.println(sumnum.N);

	}

}
