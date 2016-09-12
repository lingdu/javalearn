package com.javalearn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SumPrime {
		
		//�ж�һ�������ǲ�������
		public boolean isPrime(int num){
			boolean flag = true;
			if (num < 2){
				return false;
			}
			else{
				for (int i = 2; i <= Math.sqrt(num); i++) {  
					// ���ܱ���������˵����������������false  
	                if (num % i == 0) { 
	                    flag = false;  
	                    break;// ����ѭ��  
	                }  
	            }  
	        }  
	        return flag;  	
		}
		
		//�����ǰ��������������ڰ��������е�����
		public int primeNums(int num){
			ArrayList<Integer> arr = new ArrayList<Integer>(); //arrayLis�洢����
			Stack<Integer> stack = new Stack<Integer>(); //����stack���洢����
			
			int M = 0; //��¼num���ֽ��������ͬ����֮�͵������
			int N = 0; //0~num�������������ĸ���
			for (int i=1; i<num; i++){
				if(isPrime(i)){
					arr.add(i);
					stack.push(i);
					N++;
				}
			}
			System.out.println(arr); //�������list�����е���������
			
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
		
		//���ֲ���
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
		System.out.println("����һ��������");
		int num = scan.nextInt();
		
		SumPrime prime = new SumPrime();
		System.out.println(prime.primeNums(num));
		
	}

}
