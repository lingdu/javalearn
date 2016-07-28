package com.javalearn;

public class StringToInteger {
	
	public static boolean isValid(char[] chas){
		
		if (chas[0] != '-' && (chas[0] < '0' || chas[0] > '9')){
			return false;
		}
		
		if (chas[0] == '-' && (chas.length == 1 || chas[0] == '0')){
			return false;
		}
		
		if (chas[0] == '0' && chas.length > 1){
			return false;
		}
		
		for (int i = 1; i < chas.length; i++){
			if (chas[i] < '0' || chas[i] > '9'){
				return false;
			}
		}
		
		return true;
	}
	
	public static int convert(String str) {
		if (str == null || str.equals("")) {
			return 0; // can not convert
		}
		char[] chas = str.toCharArray();
		if (!isValid(chas)) {
			return 0; // can not convert
		}
		boolean posi = chas[0] == '-' ? false : true;
		int minq = Integer.MIN_VALUE / 10; //用来判断当前值进行转换是否会溢出
		int minr = Integer.MIN_VALUE % 10; //用来判断最后一个字符进行转换是否会
		int res = 0;
		int cur = 0;
		for (int i = posi ? 0 : 1; i < chas.length; i++) {
			cur = '0' - chas[i];
			if ((res < minq) || (res == minq && cur < minr)) {
				return 0; // can not convert
			}
			res = res * 10 + cur;
/*	
 * 不能用这种方式进行判断，因为一旦转换出的数值超过了INT所能表达整形的范围，就会发生截断		
 * 			if (res < Integer.MIN_VALUE){
				return 0;
			}*/

		}

		if (posi && res == Integer.MIN_VALUE) {
			return 0; // can not convert
		}
		return posi ? -res : res;
	}

	public static void main(String[] args) {
		String test1 = "2147483647"; // max in java
		System.out.println(convert(test1));

		String test2 = "-2147483648"; // min in java
		System.out.println(convert(test2));

		String test3 = "2147483648"; // overflow
		System.out.println(convert(test3));

		String test4 = "-2147483649"; // overflow
		System.out.println(convert(test4));

		String test5 = "-123";
		System.out.println(convert(test5));

	}
}