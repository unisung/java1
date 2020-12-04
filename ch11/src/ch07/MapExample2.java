package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
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
		
		//map으로부터 key들만 뽑아서 Set에 저장
		Set<String> keySet=map.keySet();
		//Set에 저장된 key들을 순회할 iterator생성
		Iterator<String> iterator=keySet.iterator();
		
		//Set에 저장된 key들을 하나씩 순회처리
		while(iterator.hasNext()) {
			String key=iterator.next();//set에 저장된 key하나씩 가져오기
			Integer value=map.get(key);
			System.out.println(key+"="+value);
		}
		
		
	   
	}

}
