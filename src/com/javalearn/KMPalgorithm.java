/*
 * date:20160729
 * author:lingdu
 * */


package com.javalearn;

public class KMPalgorithm {
	
	public static int getIndexOf(String s, String m){
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()){
			return -1;
		}
		
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int si = 0; //¼ÇÂ¼ s ×Ö·û´®Æ¥Åäµ½µÄÎ»ÖÃ
		int mi = 0; //¼ÇÂ¼ m ×Ö·û´®Æ¥Åäµ½µÄÎ»ÖÃ
		int[] next = getNextArray(ms);
		
		//Ñ­»·Æ¥ÅäÕû¸ö×Ö·û´®
		while (si < ss.length && mi < ms.length){
			if (ss[si] == ms[mi]){
				si++;
				mi++;
			}
			else if (next[mi] == -1){
				si++;
			}
			else{
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	public static int[] getNextArray(char[] ms) {
		// TODO Auto-generated method stub
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (ms[pos - 1] == ms[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcababaccc";
		String match = "ababa";
		System.out.println(getIndexOf(str, match));

	}

}
