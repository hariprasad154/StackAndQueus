package Com.Queue;


public class MyLinkedList <T> {

	MyNode<T> head;
	MyNode<T> tail;
	public void push(T data) {
		MyNode<T> newNode = new MyNode(data);
		if (head == null) {
			// If the Linked List is empty, 
			// then make the new node as head 
			head = newNode;
			tail = newNode;
		}else{
			// Else traverse till the last node 
			// and insert the new_node there
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void Append(T data) {
		MyNode<T> newNode = new MyNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		MyNode<T> current= head;
		while (current.next != null){
			current =current.next;

		}
		// Insert the new_node at last node 
		current.next=newNode;

	}
	public void insert(T key) {
		MyNode<T> temptail=head.next;
		MyNode<T> newNode = new MyNode(key);
		head.next=newNode;
		newNode.next=temptail;
	}
	public void pop() {
		// Store head node
		MyNode<T> currentNode = head;
		head=currentNode.next;
		return;
	}
	public T popLast() {
		T popData = tail.data;
        MyNode<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
	}
	public MyNode<T> search(T searchData) {
		MyNode<T> temp = head;
		while (temp != null) {
			if(temp.data.equals(searchData))
				return temp;
			temp = temp.next;
		}
		return null;
	}
	public boolean insertAfter(T insertData ,T searchData) {
		MyNode<T> searchedData =  search(searchData);
		if(searchedData != null){
			MyNode<T> newNode = new MyNode(insertData);
			MyNode<T> nextNode = searchedData.next;
			searchedData.next = newNode;
			newNode.next = nextNode;
			return true;
		}
		return false;	
	}
	public void display() {
		MyNode<T> temp = head;
		while(temp!=null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}
}
