package com.javalearn;

public class Second {
	
	String arr1[][]={{"i","you"},{"he"},{"a","b","c"}};
	String arr2[][]={{"i","you"},{"he"},{"a","b","c"}};
	
	public void firstMethod(){
		//for循环遍历数组
		System.out.println("for循环遍历结果：");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
				}
			System.out.println();
		}
	}
	
	public void secondMethod(){
		//foreach循环遍历数组
		System.out.println("foreach循环遍历结果：");
		for(String[] is:arr2){
			for(String is2:is){
				System.out.print(is2+" ");
			}
		System.out.println();
		}
	}
	
	public void thirdMethod(){
		//字符串分隔符split的用法
		String str1="姓名：小明！年龄：20,性别：男";
		String[] info=null;
		info=str1.split("！|!|,");//中英文!或者,分   
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
