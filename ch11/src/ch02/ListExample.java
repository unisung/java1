package ch02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		//List list = new List();
		//List list = new ArrayList();
		//List list = new LinkedList();
		List list = new Vector();
		
		//리스트에 객체 저장 add(객체)
		list.add(new Integer(10));//객체만 저장
		list.add(new Integer(20));//객체만 저장
		list.add(new Double(10.5));//객체만 저장
		list.add(new Boolean(true));//객체만 저장
		list.add(50);//기본타입이 AutoBoxing되어서 Integer(50)으로 저장
		
		//size() 저장된 요소의 갯수
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//저장된 index번호의 값
		 //50의 출력은 Integer.toString()메소드에 의해 50으로 출력
		
	}
}
