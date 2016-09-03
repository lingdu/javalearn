package com.offer;

import java.util.ArrayList;
import java.util.Stack;

public class Offer3_Solution {

    //�ݹ�ķ�ʽʵ��
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
    	
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        ListNode pNode = listNode;
        if(pNode != null){
            if(pNode.next != null){
                
                list =  printListFromTailToHead1(pNode.next);
            }
            list.add(pNode.val);
        }    
        return list;      
    }
	
	//�ǵݹ�ķ�ʽʵ�֣���ջ
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<Integer>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;     
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
