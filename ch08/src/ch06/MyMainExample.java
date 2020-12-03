package ch06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyMainExample {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
		Map<String,CommandAction> map
     = new HashMap<String,CommandAction>();
     
     map.put("write", new WriteAction());
     map.put("read", new ReadAction());
     map.put("list", new ListAction());
     map.put("reply", new ReplyAction());
     map.put("update", new UpdateAction());
     map.put("delete", new DeleteAction());
  //map -키, 값으로 객체를 저장
   Set<String> menuList =map.keySet();
   
    for(String s:menuList)
    	System.out.print(s+"\t");
    
	System.out.println("\n 원하는 작업을 입력하세요");
	String menu=scanner.next();
	
	//메뉴에 해당하는 객체의 action()메소드 실행
	  CommandAction action=map.get(menu);
	  action.action();
	  
	  
	
	}
}
