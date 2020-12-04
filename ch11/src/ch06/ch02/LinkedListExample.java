package ch06.ch02;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list =  new LinkedList<String>();
		
		//객체 저장
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
		
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//삽입
		list.add(1,"강감찬");
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//객체 대체
		list.set(1,"이순신");
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//검색
		System.out.println(list.get(1));
		System.out.println(list.contains("유관순"));
		System.out.println(list.size());
		
		//삭제-remove()
		System.out.println(list.remove(3));
		System.out.println(list.remove("일지매"));
		list.clear();//전체 삭제
		System.out.println(list.isEmpty());
		
		

	}
}
