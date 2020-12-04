package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
      //Set set=new Set();
		Set set=new HashSet();
		
		//add(객체) - 저장
		set.add(new Integer(10));
		set.add(new Integer("20"));
		set.add(10);//AutoBoxing set은 중복저장하지 않음
		set.add(30);//AutoBoxing
		
	//내용 출력	
	 System.out.println(set);	

	}
}
