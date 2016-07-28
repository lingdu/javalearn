package com.javalearn;

public class XuanZhuanWords {
	
	public static boolean xuanZhuan(String str1, String str2){
		
		if (str1.length() != str2.length() || str1 == null || str2 == null){
			return false;	
		}
		
		String str3 = str1 + str2;
		
		return getIndexOf(str3, str1) != -1;
		
	}
	
	// KMP Algorithm
	// kmp算法需要着重复习下
		public static int getIndexOf(String s, String m) {
			if (s.length() < m.length()) {
				return -1;
			}
			char[] ss = s.toCharArray();
			char[] ms = m.toCharArray();
			int si = 0;
			int mi = 0;
			int[] next = getNextArray(ms);
			while (si < ss.length && mi < ms.length) {
				if (ss[si] == ms[mi]) {
					si++;
					mi++;
				} else if (next[mi] == -1) {
					si++;
				} else {
					mi = next[mi];
				}
			}
			return mi == ms.length ? si - mi : -1;
		}

		public static int[] getNextArray(char[] ms) {
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
		String str1 = "yunzuocheng";
		String str2 = "zuochengyun";
		System.out.println(xuanZhuan(str1, str2));

	}

}
