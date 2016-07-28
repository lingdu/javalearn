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
	
	//�б�ڵ��ӡ
	public void print(){
		
		Node current = getFirst();
		while(current != null){
			System.out.println("[" + current.data + " " + current.names + " " + 
					current.num + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	//˳�����ָ���ڵ㵽��ǰ���б�
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
	
	//ɾ���ڵ�
	public void delete(Node delNode){
		
		Node newNode;
		Node tmp;
		
		//ɾ��ͷ�ڵ�
		if (getFirst().data == delNode.data){
			setFirst(getFirst().next);
		}
		//ɾ��β�ڵ�
		else if (getLast().data == delNode.data){
			
			newNode = getFirst();
			while (newNode.next != getLast()){
				newNode = newNode.next;
			}
			newNode.next = getLast();
			setLast(newNode);	
		}
		//ɾ���м�ڵ�
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

	//��˳�����ڵ㵽�б�
	public void unInsert(Node ptr){
		
		Node tmp;
		Node newNode;
		
		if (this.isEmpty()){
			first = ptr;
			setLast(ptr);
		}
		else{
			//�����׽ڵ�
			if (ptr.next == first){
				ptr.next = first;
				first = ptr;
			}
			//����β�ڵ�
			else {
				if (ptr.next == null){
					getLast().next = ptr;
					setLast(ptr);
				}
				//�����м�ڵ�
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
	
	
	
	//���ʺ͸ı�����˽�г�Ա������get��set����
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
