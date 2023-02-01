package Com.Stack;

public class StackMain {
    
public static void main(String[] args) {
	Stack<Integer> stack =new Stack();
	stack.push(70);
	stack.push(30);
	stack.push(56);
	System.out.println("initial stack");
	stack.display();
	System.out.println("popping ");
	stack.popTillEmpty();
	System.out.println("pop display after pop ");
	stack.display();
	System.out.println("peek");
	stack.peek();
	
	stack.display();
	System.out.println("the stck is empty=> "+stack.isEmpty());
	System.out.println("the stck is full => "+stack.isFull());
}


}
