package com.javalearn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SumPrime {
		
		//判断一个整数是不是质数
		public boolean isPrime(int num){
			boolean flag = true;
			if (num < 2){
				return false;
			}
			else{
				for (int i = 2; i <= Math.sqrt(num); i++) {  
					// 若能被整除，则说明不是素数，返回false  
	                if (num % i == 0) { 
	                    flag = false;  
	                    break;// 跳出循环  
	                }  
	            }  
	        }  
	        return flag;  	
		}
		
		//求出当前输入的整数区间内包含的所有的质数
		public int primeNums(int num){
			ArrayList<Integer> arr = new ArrayList<Integer>(); //arrayLis存储数据
			Stack<Integer> stack = new Stack<Integer>(); //利用stack来存储数据
			
			int M = 0; //记录num被分解成两个不同质数之和的组合数
			int N = 0; //0~num这个区间的质数的个数
			for (int i=1; i<num; i++){
				if(isPrime(i)){
					arr.add(i);
					stack.push(i);
					N++;
				}
			}
			System.out.println(arr); //输出整形list数组中的所有质数
			
			int[] sum = new int[arr.size()];
			int i = arr.size();
			while(!stack.empty()){
				sum[--i] = stack.pop();
				//System.out.println(stack.pop());
			}
			for(int j=0; j<sum.length; j++){
				System.out.print(sum[j] + " ");
			}
			System.out.println();
			
			for(int n=0; n<sum.length; n++){
				if(binSearch(sum, num-sum[n])){
					M++;
				}
			}
			return M/2;
		}
		
		//二分查找
		public boolean binSearch(int[] arr, int des){
			int low = 0;   
	        int high = arr.length-1;   
	        while(low <= high) {
	            int middle = (low + high)/2;   
	            if(des == arr[middle]) {   
	                return true;   
	            }else if(des <arr[middle]) {   
	                high = middle - 1;   
	            }else {   
	                low = middle + 1;   
	            }  
	        }  
			return false;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个整数：");
		int num = scan.nextInt();
		
		SumPrime prime = new SumPrime();
		System.out.println(prime.primeNums(num));
		
	}

}
