package ch05;

import java.util.ArrayList;
import java.util.List;

public class GenericExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		//컴파일시 타입 체크 됨.
//		list.add("사십");
		
	    //Object -> Integer로의 형변환 불필요
		int result =list.get(0) +list.get(1);
		System.out.println(result);
		
		

	}

}
