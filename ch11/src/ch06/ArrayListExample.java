package ch06;

import java.util.ArrayList;

public class ArrayListExample {
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
		
		for(String s:list) System.out.println(s);
		
		//임의의 위치의 객체를 다른 객체로 대체
		//set(index,객체)
		list.set(2, "이순신");
		
		for(String s:list) System.out.println(s);
		
		//검색 기능
		boolean exists=list.contains("이순신");
		System.out.println(exists);
		System.out.println(list.contains("유관순"));
		
		//특정index의 객체 얻기 get(index)
		String name=list.get(2);
		System.out.println(name);
		
		//객체가 비어있는지 확인 isEmpty()
		boolean isEmp = list.isEmpty();
		System.out.println(isEmp ? "비어있음" : "객체가 리스트에 저장되어있음");
		
		//list에 저장된 객체의 갯수 size()
		int size=list.size();
		System.out.println("저장된 객체수: "+size);
		
		//객체 삭제
		String str=list.remove(0);//index번호 0번지의 객체 삭제
		System.out.println("삭제된 객체: "+str);
		System.out.println("삭제 후 남의 객체 수: "+list.size());
		
		//boolean = list.remove(객체)
		boolean deleted = list.remove("강감찬");
		System.out.println("삭제되었나?"+(deleted?"네":"아니요"));
		
		//list의 모든 요소 삭제 - clear()
		list.clear();
		System.out.println(list.isEmpty()?"모두삭제됨":"아직 요소가 남음");

	}

}
