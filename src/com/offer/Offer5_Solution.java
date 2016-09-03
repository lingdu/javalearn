package com.offer;

import java.util.Stack;

public class Offer5_Solution {
	
	public static class TwoStacksQueue{
		private int i = 0;
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
	 
		Stack<Integer> stackPush = stack1;
		Stack<Integer> stackPop = stack2;
	    
	    public void push(int node) {
	        stackPush.push(node);
	        i++;
	    }
	    
	    public int pop() {
	    	if (stackPop.empty() && stackPush.empty()){
	    		throw new RuntimeException("The Queue is Empty!");
	    	}
	    	else if (stackPop.empty()){
	    		while (!stackPush.empty()){
	    			stackPop.push(stackPush.pop());
	    		}
	    	}
			return stackPop.pop();
	    
	    }
	    
/*	    public boolean empty(){
	    	if (stackPop.empty()){
	    		return true;
	    	}
			return false;
	    }*/
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacksQueue test = new TwoStacksQueue();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		
		while((test.i--) != 0){
			System.out.println(test.pop());
		}
	}
}
