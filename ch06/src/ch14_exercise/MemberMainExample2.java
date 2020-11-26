package ch14_exercise;

import java.util.ArrayList;
import java.util.List;

public class MemberMainExample2 {
	public static void main(String[] args) {
		List<Member> list
		=new ArrayList<Member>();
		
		//객체 저장
		list.add(new Member("홍길동", "hong@naver.com"));
		list.add(new Member("일지매", "ilji@naver.com"));
		list.add(new Member("임꺽정", "im@naver.com"));

		//개별회원 정보
	    for(Member m:list) {
	    	m.info();
	    }
	    
	    //총회원수
	    System.out.println(list.size());
		
		
		
	}

}
