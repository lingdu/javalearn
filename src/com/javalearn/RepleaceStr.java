package com.javalearn;

import java.sql.ResultSet;

public class RepleaceStr {
	
	public static String repleaseSameStr(String str, String from, String to) {
		// TODO Auto-generated method stub
		//char[] chas = str.toCharArray();
		//char[] chaf = from.toCharArray();
		//char[] chat = to.toCharArray();
		if (str.length() < from.length() 
				|| str == null || from == null || str.equals("") || from.equals("")){
			return str;
		}
		String newstr = moveSameStr(str, from);
		System.out.println(newstr);
		char[] chan = newstr.toCharArray();

		String res = "";
		String cur = "";
		for (int i = 0; i < chan.length; i++){
			if (chan[i] != 0){
				cur = cur + String.valueOf(chan[i]);
			}
			if (chan[i] == 0 && (i == 0 || chan[i-1] != 0)){
				res = res + cur + to;
				cur = "";
			}
		}
		if (!cur.equals("")){
			res = res + cur;
		}
		return res;
	}
	
	//将str字符串中的所有的from字符串去除（变为连续的 0 ）
	public static String moveSameStr(String str, String from){
		char[] chaf = from.toCharArray();
		String fres = str;
		int pos = 0;
		while (KMPalgorithm.getIndexOf(fres, from) != -1){
			pos = KMPalgorithm.getIndexOf(fres, from);
			if (pos == -1){
				return fres;
			}
			char[] chas = fres.toCharArray();
			fres = clear(chas, pos, chaf.length);
			moveSameStr(fres, from);
		}
		return fres;
	}
	
	//将str中从匹配到的from字符串变为连续的 0 
	public static String clear(char[] chas, int end, int len){
		while (len-- != 0){
			chas[end++] = 0;
		}
		return String.valueOf(chas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123abc456abc";
		String from = "abc";
		String to = "bbr";
		
		String res = repleaseSameStr(str, from, to);
		System.out.println(res);
		
	}

}
