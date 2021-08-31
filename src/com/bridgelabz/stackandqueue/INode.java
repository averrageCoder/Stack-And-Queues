package com.bridgelabz.stackandqueue;

public interface INode<K extends Comparable<K>> {

	K getKey();
	void setKey(K Key);
	
	INode getNext();
	void setNext(INode next);
	
}
