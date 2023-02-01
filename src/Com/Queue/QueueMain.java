package Com.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> que = new Queue();
		que.enqueue(56);
		que.enqueue(30);
		que.enqueue(70);
		que.display();
		que.Dequeue();
		que.display();

	}

}
