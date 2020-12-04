package ch06.ch03;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
      //Vector<String> vector=new Vector<String>();	
		//new Vector<>() <-<>안의 타입 생략가능
		 Vector<String> vector=new Vector<>();
		 //객체 저장
		 vector.add("홍길동");
		 vector.add("일지매");
		 vector.add("임꺽정");
		 
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //삽입
		 vector.add(1,"강감찬");
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //대체
		 vector.set(1, "이순신");
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //검색
		 System.out.println(vector.contains("이순신"));
		 System.out.println(vector.get(2));
		 System.out.println(vector.size());
		 
		 //삭제
		 System.out.println(vector.remove(2));
		 System.out.println(vector.size());
		 System.out.println(vector.remove("임꺽정"));
		 vector.clear();
		 System.out.println(vector.isEmpty());
		 

	}

}
