package com.javalearn;

public class Second {
	
	String arr1[][]={{"i","you"},{"he"},{"a","b","c"}};
	String arr2[][]={{"i","you"},{"he"},{"a","b","c"}};
	
	public void firstMethod(){
		//forѭ����������
		System.out.println("forѭ�����������");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
				}
			System.out.println();
		}
	}
	
	public void secondMethod(){
		//foreachѭ����������
		System.out.println("foreachѭ�����������");
		for(String[] is:arr2){
			for(String is2:is){
				System.out.print(is2+" ");
			}
		System.out.println();
		}
	}
	
	public void thirdMethod(){
		//�ַ����ָ���split���÷�
		String str1="������С�������䣺20,�Ա���";
		String[] info=null;
		info=str1.split("��|!|,");//��Ӣ��!����,��   
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second second = new Second();
		second.firstMethod();
		System.out.println("\n");
		second.secondMethod();
		System.out.println("\n");
		second.thirdMethod();
		
	}

}
