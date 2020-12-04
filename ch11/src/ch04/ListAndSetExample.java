package ch04;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
1."서울", "대전","서울", "대구","부산" 을 중복해서 저장하고 출력하기
2."서울", "대전","서울", "대구","부산" 을 중복없이 저장하고 출력하기
 */
public class ListAndSetExample {
	public static void main(String[] args) {
		//1."서울", "대전","서울", "대구","부산" 을 중복해서 저장하고 출력하기
		  //List list = new ArrayList();
		 //List list = new LinkedList();
		 List list = new Vector();
		 //저장 add(객체);
          list.add("서울");
          list.add("대전");
          list.add("서울");
          list.add("대구");
          list.add("부산");
          
         //출력 get(index번호)
         //저장된 객체의 갯수 size()
          for(int i=0;i<list.size();i++)
        	   System.out.println(list.get(i));
          
         		 
		//2."서울", "대전","서울", "대구","부산" 을 중복없이 저장하고 출력하기
		 Set set=new HashSet();
		 
		 //저장 add(객체)
		 set.add("서울");
		 set.add("대전");
		 set.add("서울");
		 set.add("대구");
		 set.add("부산");
		 
		 //내용출력
		 System.out.println(set);
		 
		

	}
}
