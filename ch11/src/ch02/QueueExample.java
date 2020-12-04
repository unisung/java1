package ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer(new Integer(10));
		que.offer(10.0);//autoBoxing
		que.offer(new Float(10.5));
		que.offer(true);//autoBoxing
	
		//力老 刚历 历厘等 按眉 惶扁 poll();
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}
}
