package com.javalearn;

public class First {
	
	public void firstMethod(){
		//打印一个5*5的乘法表
		loop:
			for(int i = 0; i<=9; i++){
			   for(int j=1; j<=i; j++){
					System.out.print(i+"*"+j+"="+i*j+"");
					if(j==5){
						break loop;
					}
				}
				System.out.println();
			}
	}
	
	public void secondMethod(){
		
		String day[]=new String[]{"星期一","星期二","星期三","星期四","星期五","星期六","星期七"};
		for(int i=0;i<day.length;i++){
			System.out.println(day[i]);
		}
	}
	
	//冒泡排序
	public void mysort(){
		int arr[]={6,4,43,1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){//大的向后面移动
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First();
		first.firstMethod();
		System.out.println("\n");
		first.secondMethod();
		System.out.println("\n");
		first.mysort();

	}

}
