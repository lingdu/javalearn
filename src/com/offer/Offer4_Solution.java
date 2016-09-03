package com.offer;

import java.util.HashMap;

public class Offer4_Solution {

	//Definition for binary tree
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x){
			this.val = x;
		}
		
	}
	
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	
		if (pre == null || in == null) {
			return null;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < in.length; i++) {
			map.put(in[i], i);
		}
		return preIn(pre, 0, pre.length - 1, in, 0, in.length - 1, map);
        
    }
    
    public static TreeNode preIn(int[] p, int pi, int pj, int[] n, int ni, int nj,
			HashMap<Integer, Integer> map) {
		if (pi > pj) {
			return null;
		}
		TreeNode head = new TreeNode(p[pi]);
		int index = map.get(p[pi]);
		head.left = preIn(p, pi + 1, pi + index - ni, n, ni, index - 1, map);
		head.right = preIn(p, pi + index - ni + 1, pj, n, index + 1, nj, map);
		return head;
	}
    
	// for test -- print tree
	public static void printTree(TreeNode head) {
		System.out.println("Binary Tree:");
		printInOrder(head, 0, "H", 17);
		System.out.println();
	}
	
	public static void printInOrder(TreeNode head, int height, String to, int len) {
		if (head == null) {
			return;
		}
		printInOrder(head.right, height + 1, "v", len);
		String val = to + head.val + to;
		int lenM = val.length();
		int lenL = (len - lenM) / 2;
		int lenR = len - lenM - lenL;
		val = getSpace(lenL) + val + getSpace(lenR);
		System.out.println(getSpace(height * len) + val);
		printInOrder(head.left, height + 1, "^", len);
	}

	public static String getSpace(int num) {
		String space = " ";
		StringBuffer buf = new StringBuffer("");
		for (int i = 0; i < num; i++) {
			buf.append(space);
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = { 1, 2, 4, 5, 8, 9, 3, 6, 7 };
		int[] in = { 4, 2, 8, 5, 9, 1, 6, 3, 7 };

		printTree(reConstructBinaryTree(pre, in));

	}

}
