package ch01;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		//List list = new List();
		List list = new ArrayList();
		
		//리스트에 객체 저장 add(객체)
		list.add("홍길동");
		list.add("일지매");
		list.add("홍길동");
		list.add("임꺽정");
		
		//size() 저장된 요소의 갯수
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//저장된 index번호의 값
		
		
	}
}
