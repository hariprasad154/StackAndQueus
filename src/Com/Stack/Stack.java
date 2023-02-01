package Com.Stack;

import Com.Stack.*;

public class Stack<T> {
	MyLinkedList<T> linkedList;
	public Stack() {
        linkedList = new MyLinkedList<>();
    }

    public void push(T data) {
        linkedList.push(data);
    }
    public void pop() {
    	linkedList.pop();
    }

    public void popTillEmpty() {
    	while(linkedList.head != null) {
    			linkedList.pop();
    		display();
    	}
    	
    }
    public void display() {
    	linkedList.display();
    	
    }
    public void peek() {
    	if (linkedList.head==null) {
    		System.out.println("The stack is empty");
    		
    	}else {
    		System.out.println("The peek => "+ linkedList.tail.data);
    	}
    }
    public boolean isEmpty() {
    	if (linkedList.head==null) {
    		return true;
    	}else 
    	return false;
    }
    public boolean isFull() {
    	if (linkedList.head!=null) {
    		return true;
    	}else 
    	return false;
    }
    

}
