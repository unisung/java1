package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
     // Map map=new Map();
		Map map=new HashMap();
		
		//map에 키와 값으로 객체 저장
		//put(키,값)
		map.put("홍길동", new Integer(85));
		map.put("일지매", 90);//AtuoBoxing
		map.put("홍길동", new Integer(88));//키가 중복됨 동일키 저장시 마지막 객체로 override됨
		map.put("임꺽정", 75);//AtuoBoxing
		map.put("이순신", 80);//키가 다르면 값에 해당하는 값은 중복됨.

		//get(키) ->리턴되는 것은 키에 해당하는 객체
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("일지매"));
		System.out.println(map.get("임꺽정"));
		System.out.println(map.get("이순신"));
		

	}

}

