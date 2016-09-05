package com.javastruct;

public class BinaryTree{
	public TreeNode rootNode;
	public BinaryTree(int[] data){
		for (int i=0; i<data.length; i++){
			Add_Node_To_Tree(data[i]);
		}
	}
	void Add_Node_To_Tree(int value) {
		// TODO Auto-generated method stub
		TreeNode curNode = rootNode;
		if (rootNode == null){
			rootNode = new TreeNode(value);
			return;
		}
		
	    //����������
	      while(true) {
	         if (value<curNode.value) { //��������
	            if(curNode.left_Node==null) {
	              curNode.left_Node=new TreeNode(value);
	              return;
	            }
	            else curNode=curNode.left_Node;
	         }
	         else { //��������
	            if(curNode.right_Node==null) {
	              curNode.right_Node=new TreeNode(value);
	              return;
	            }
	            else curNode=curNode.right_Node;
	         }
	       }
		
	}
}