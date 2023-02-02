package Com.Queue;

public class Queue<T> {
	MyLinkedList<T> linkedList;
	public Queue() {//the main method to call the que
		linkedList = new MyLinkedList<>();
	}
	public void enqueue(T data) {//the method to append the push the data
		linkedList.Append(data);
	}
	public  void Dequeue() {//the method to pop the data
		MyNode<T> temp = linkedList.head;
		while(temp.next !=linkedList.tail) {
			temp=temp.next;
		}
		temp.next=null;
		temp =linkedList.tail;

	}

	public void display() {//method to display the data
		linkedList.display();
	}


}
