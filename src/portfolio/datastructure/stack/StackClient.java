package portfolio.datastructure.stack;

import portfolio.datastructure.stack.stack.ArrayStack;
import portfolio.datastructure.stack.stack.StackExample;

public class StackClient {
	
	public static void main(String[] args) {
		StackExample<Integer> stack = new ArrayStack<>(10);
//		StackExample<Integer> stack = new LinkedStack<>();
		
		System.out.println(stack.isEmpty());
		stack.push(1);
		System.out.println(stack.isEmpty());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		for(int i=0; i<10; i++) {
			System.out.println( stack.pop() );
		}
	}
}
