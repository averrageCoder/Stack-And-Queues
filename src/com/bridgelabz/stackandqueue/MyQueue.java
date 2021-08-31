package com.bridgelabz.stackandqueue;

public class MyQueue {

	private final MyLinkedList myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	public void printQueue() {
		
		myLinkedList.printMyNodes();
		
	}
	
}
