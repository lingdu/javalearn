package com.offer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Offer2_Solution {

	//方法1，用replaceAll()方法
    public static String replaceSpace1(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
	
    //方法2，正常的方法
    public static String replaceSpace2(StringBuffer str) {
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' '){
                stb.append("%20");
            }else{
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = buf.readLine();
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(replaceSpace1(str1));
		System.out.println(replaceSpace2(str1));
	}

}
