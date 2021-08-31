package com.bridgelabz.stackandqueue;

public class MyStackAndQueue {
	
	private INode top;
	private int size;
	
	public MyStackAndQueue() {
		this.top = null;
		this.size=0;
	}
	
	public void push(INode myNode) {
		
		if(this.top==null) {
			this.top=myNode;
		}
		else {
			INode tempNode = this.top;
			this.top = myNode;
			this.top.setNext(tempNode);
		}
		this.size++;
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.top;
		if(tempNode==null)
			System.out.println("Empty List!");
		else {
			while(tempNode.getNext()!=null) {
				myNodes.append(tempNode.getKey());
				myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}
	}
	
}
