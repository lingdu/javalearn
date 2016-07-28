package com.javastruct;

class Node{
	int data;
	int num;
	String names;
	Node next;
	
	public Node(int data, String names, int num){
		
		this.data = data;
		this.num = num;
		this.names = names;
		this.next = null;
	}
}

public class LinkList {

	private Node first;
	private Node last;
	
	public boolean isEmpty(){
		
		return getFirst() == null;	
	}
	
	//列表节点打印
	public void print(){
		
		Node current = getFirst();
		while(current != null){
			System.out.println("[" + current.data + " " + current.names + " " + 
					current.num + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	//顺序插入指定节点到当前的列表
	public void insert(int data, String names, int num){
		
		Node newNode = new Node(data, names, num);
		
		if(this.isEmpty()){
			
			setFirst(newNode);
			setLast(newNode);	
		}
		else{
			
			getLast().next = newNode;
			setLast(newNode);
		}
	}
	
	//删除节点
	public void delete(Node delNode){
		
		Node newNode;
		Node tmp;
		
		//删除头节点
		if (getFirst().data == delNode.data){
			setFirst(getFirst().next);
		}
		//删除尾节点
		else if (getLast().data == delNode.data){
			
			newNode = getFirst();
			while (newNode.next != getLast()){
				newNode = newNode.next;
			}
			newNode.next = getLast();
			setLast(newNode);	
		}
		//删除中间节点
		else {
			newNode = getFirst();
			tmp = getFirst();
			while (newNode.data == delNode.data){
				tmp = newNode;
				newNode = newNode.next;
			}
			tmp.next = newNode.next;
		}
	}

	//非顺序插入节点到列表
	public void unInsert(Node ptr){
		
		Node tmp;
		Node newNode;
		
		if (this.isEmpty()){
			first = ptr;
			setLast(ptr);
		}
		else{
			//插入首节点
			if (ptr.next == first){
				ptr.next = first;
				first = ptr;
			}
			//插入尾节点
			else {
				if (ptr.next == null){
					getLast().next = ptr;
					setLast(ptr);
				}
				//插入中间节点
				else {
					newNode = first;
					tmp = first;
					while (ptr.next != newNode.next){
						tmp = newNode;
						newNode = newNode.next;
					}
					tmp.next = ptr;
					ptr.next = newNode;
					
				}
			}
		}
	}
	
	
	
	//访问和改变类中私有成员变量的get和set方法
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
