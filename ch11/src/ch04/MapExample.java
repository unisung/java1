package ch04;

import java.util.HashMap;
import java.util.Map;

//3. "서울" 30도, "베이징" 25도, "도쿄" 28도 
public class MapExample {
	public static void main(String[] args) {
     //키와 값으로 객체 저장하는 Map객체 생성
		Map map=new HashMap();
		
		//객체 저장,(키,값)
		map.put("서울", 30);//키-"서울", value=30 <-AutoBoxing
		map.put("베이징", new Integer(25));//키 -"베이징"
		map.put("도쿄", 28);//키-"도쿄", AtuoBoxing
		
		
		//출력
 int celcius=(Integer)map.get("서울");//Integer로 추출되서 ->int로 AutoUnBoxing
		System.out.println("서울의 온도는 "+celcius+"도 입니다.");
		
 celcius=(Integer)map.get("베이징");//Integer로 추출되서 ->int로 AutoUnBoxing
 System.out.println("베이징의 온도는 "+celcius+"도 입니다.");
	
 System.out.println("도쿄의 온도는 "+map.get("도쿄")+"도 입니다.");
 
		
	}

}
