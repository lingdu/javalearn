package com.javalearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumInStr {
	
	
/*	int Num = 0; //记录数字子串的个数
	int[] MumStr = new int[256]; //记录每个数字子串的整形数组,数组大小为256
	
	public SumNumInStr(int n, int[] m){
		this.Num = n;
		this.MumStr = m;
	}*/
	
	public int numSum(String str){
		
		if (str == null){
			return 0;
		}
		
		char[] charArr = str.toCharArray();
		int res = 0; //记录最终的统计结果
		int num = 0; //记录当前所收集到的数字子串
		boolean ptr = true; //记录当前遍历的数字的正负状态
		int cur = 0; //记录当前遍历的数字字符
		int N = 0;
		int[] M = null;
		for (int i=0; i < charArr.length; i++){
			cur = charArr[i] - '0'; //将当前遍历的每一个字符转换成ascii码表示
			if (cur < 0 || cur > 9){
				res += num;
				if (num != 0){
					M[N++] = num;
				}
				
				num = 0;
				
				if (charArr[i] == '-'){
					if (i-1 > -1 && charArr[i-1] == '-'){
						ptr = !ptr; //连续遍历到两个'--'时，ptr为正
					}
					else{
						ptr = false; //遍历到一个 '-' ，则令ptr为负
					}
				}
				else{
					ptr = true; //如果遍历到 '-' 之后的下一个字符不是数字0-9，则令ptr为正
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
		System.out.println("请输入字符串：");
		String str2 = buf.readLine();
		
		SumNumInStr sumnum = new SumNumInStr();
		System.out.println(sumnum.numSum(str2));
		//System.out.println(sumnum.N);

	}

}
