package ch06;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		
		//추가기능 - add(객체), add(index,객체), set(index,객체)
		//저장메소드 add-append 뒤에 추가
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
	
		//출력
		for(String s:list) System.out.println(s);
		
		//임의의 위치에 저장- add(index,객체)
		//중간에 객체 삽입되면 뒤에있는 객체들이 하나씩 뒤로 자동이동.
		list.add(1, "강감찬");//index번호 1번 주소에 저장
		
		//java.lang.IndexOutOfBoundsException 예외 발싱
		//중간 삽입시 index번호는 객체의 size()번호 내의 값이 어야함.
		//list.add(5,"이순신");
		
		
		//저장된 범위 밖의 index번호로 삭제 시 오류 발생
		//java.lang.IndexOutOfBoundsException 예외 발싱
		//list.remove(4);
		
		

	}

}
