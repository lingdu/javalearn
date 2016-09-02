package com.offer;

import com.javalearn.FindNodeInRectangle;

public class Offer1_Solution {
	
    public static boolean Find(int [][] array,int target) {
        
        int m = array.length - 1;//ĞĞÊı
        int i = 0;
        while(m >= 0 && i < array[0].length){
            if(array[m][i] > target)
                m--;
            else if(array[m][i] < target)
                i++;
            else
                return true;
        }
         
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int tar = 5;
		System.out.println(Find(arr, tar));
	}

}
