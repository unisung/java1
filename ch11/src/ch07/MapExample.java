package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//new HashMap<String, String>();//생략가능 new HashMap<>()
		Map<String, Integer> map=new HashMap<>();
		
		//Entry저장
		map.put("서울",200);
		map.put("대전",100);
		map.put("대구",300);
		map.put("서울",300);//키가 중복되면 마지막 객체 value로 대체
		map.put("부산",150);
		
		//
		System.out.println(map.size());
		
		//map으로부터 Entry단위로 Set에 저장
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//반복자(itertor)를 Entry단위로 추출
		Iterator<Map.Entry<String, Integer>> iterator 
		                                 =entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	    //특정키의 객체 추출하기
	   System.out.println(map.get("서울"));//서울의 확진자수 
	   
	   //삭제
	   System.out.println(map.remove("대구"));
	   System.out.println(map.size());
	   
	   //전체 삭제
	   map.clear();
	   System.out.println(map.isEmpty());
	   
	}

}
