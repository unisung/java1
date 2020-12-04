package ch02;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack stack=new Stack();
		
		//AutoBoxing
		stack.push(new Boolean(true));
		stack.push(10);
		stack.push(false);
		stack.push(10.5);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
