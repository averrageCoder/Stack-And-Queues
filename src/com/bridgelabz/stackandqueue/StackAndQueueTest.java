package com.bridgelabz.stackandqueue;

public class StackAndQueueTest {

	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(firstNode);
		//myQueue.printQueue();
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
		
		myQueue.dequeue();
		System.out.println("After dequeue: ");
		myQueue.printQueue();
	}

}
