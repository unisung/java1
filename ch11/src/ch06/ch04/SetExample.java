package ch06.ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	  //new HashSet<타입>() <- 타입생략가능 
	  Set<String> set=new HashSet<>();
	  
	  //저장
	  set.add("홍길동");
	  set.add("일지매");
	  set.add("홍길동");
	  set.add("임꺽정");
	  
	  //저장된 객체 수
	  System.out.println(set.size());
	  //내용출력
	  System.out.println(set);
	  //요소 추출
	  //set.iterator()로 Iterator객체 생성-생성시 set에 저장된 객체들의
	  //순서와 주소를 파악해서 저장해놓음 
	  //단,요소(객체)들을 저장하지는 않음.
	  Iterator<String> iterator=set.iterator();
	  //System.out.println(iterator.next());
	  //System.out.println(iterator.next());
	  //System.out.println(iterator.next());
	  
	  //Iterator가 가리키는 set의 요소들의 주소가 존재하는여부확인 
	  //hasNext()메소드 실행 
	  while(iterator.hasNext()) {
		  String obj=iterator.next();
		  System.out.println(obj+" ");
	  }
	  System.out.println();
	  
	  //set에 해당객체 존재여부 확인 contains(객체)
	  System.out.println(set.contains("홍길동"));
	  
	  //삭제
	  System.out.println(set.remove("홍길동"));
	  
	  //크기 size()
	  System.out.println(set.size());
	  
	  //전체 삭제
	  set.clear();
	  
	  //비었는지 여부확인
	  System.out.println(set.isEmpty());
	  
	  

	}
}
