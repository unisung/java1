package ch01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push("È«±æµ¿");
		stack.push("ÀÏÁö¸Å");
		stack.push("È«±æµ¿");
		stack.push("ÀÓ²©Á¤");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
