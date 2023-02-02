package Com.Queue;

public class Queue<T> {
	MyLinkedList<T> linkedList;
	public Queue() {
		linkedList = new MyLinkedList<>();
	}
	public void enqueue(T data) {
		linkedList.Append(data);
	}
	public  void Dequeue() {
		MyNode<T> temp = linkedList.head;
		while(temp.next !=linkedList.tail) {
			temp=temp.next;
		}
		temp.next=null;
		temp =linkedList.tail;
		
	}
	
	public void display() {
		linkedList.display();
	}


}
