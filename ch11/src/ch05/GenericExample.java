package ch05;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("사십");
		
		// Object ->Integer형변환 
		int result =(Integer)list.get(0) + (Integer)list.get(1);
		System.out.println(result);
		
		result =(Integer)list.get(2) + (Integer)list.get(3);
		System.out.println(result);

	}

}
