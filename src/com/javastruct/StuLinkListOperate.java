package com.javastruct;
import java.util.*;
import java.io.*;
public class StuLinkListOperate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		   BufferedReader buf;
		   Random rand = new Random();
		   buf=new BufferedReader(new InputStreamReader(System.in));
		   LinkList list = new LinkList();
		   int i,j;
		   int findword = 0;
		   int data[][] = new int[12][10];
		   String name[] = new String[] {"Allen","Scott","Marry","Jon","Mark","Ricky","Lisa","Jasica","Hanson","Amy","Bob","Jack"};
		   System.out.println("ѧ�ųɼ�ѧ�ųɼ�ѧ�ųɼ�ѧ�ųɼ�\n ");
		   for (i=0; i<12; i++)
		   {
			   data[i][0] = i+1;
			   data[i][1] = (Math.abs(rand.nextInt(50)))+50;
			   list.insert(data[i][0], name[i], data[i][1]);
		   }
		   for (i=0; i<3; i++)
		   {
			   for(j=0; j<4; j++)
				   System.out.print("["+data[j*3+i][0]+"]  ["+data[j*3+i][1]+"]  ");
			   System.out.println();
		   }

		   while(true)
		   {
			   System.out.print("����Ҫɾ���ɼ���ѧ�ţ���������-1�� ");
			   findword = Integer.parseInt(buf.readLine());
			   if(findword == -1)
				   break;
			   else
			   {
				   Node current = new Node(list.getFirst().data, list.getFirst().names, list.getFirst().num);
				   current.next = list.getFirst().next;
				   while(current.data != findword) current=current.next;
				   list.delete(current);
			   }
			   System.out.println("ɾ����ɼ��б���ע�⣡Ҫɾ���ĳɼ���ѧ�ű����ڴ��б���\n");
			   list.print();
		   }

	}

}
