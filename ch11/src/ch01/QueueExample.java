package ch01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer("全辨悼");
		que.offer("老瘤概");
		que.offer("全辨悼");
		que.offer("烙博沥");
	
		//力老 刚历 历厘等 按眉 惶扁 poll();
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}
}
