package verify.ch20_ch04_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApplication {
	//길이가 가변, null여부확인 유리
	private static List<Member> memberArray = new ArrayList<Member>();
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String[] args){
	  boolean run=true;
	while(run){
	    printMenu();
	   int selectNo = scanner.nextInt();
	if(selectNo==1){
	  createMember();
	}else if(selectNo==2){
	  memberList();
	}else if(selectNo==3){
	 deposit();
	}else if(selectNo==4){
	 withdraw();
	}else if(selectNo==5){
	  changePassword();
	}else if(selectNo==6){
		  run=false;
	}
	}
	System.out.println("프로그램 종료");
	}
 
 //비번 변경하기
private static void changePassword() {
	String id=null;
	 //id입력
	 System.out.println("id>");
	   id=scanner.next();
	   Member member = findMember(id);
	   
      if(member!=null) {
    	 do {
    		//회원비밀번호
    		  System.out.println("비밀번호>");
    		  String password=scanner.next();
    		  if(password.equals(member.getPassword())) {
    			  System.out.println("변경할 비밀번호>");
        		  String newPassword=scanner.next();
        		  member.setPassword(newPassword);
        		  System.out.println("비밀번호가 변경되었습니다.");
        		  break;
    		  }else {
    			  System.out.println("기존비번이 아닙니다.");
    		  }
    	 }while(true);
      }
}

//회원 생성하기
private static void createMember() {
		String id=null;
		//회원id
		do {  
			//id입력
		     System.out.println("id>");
		     id=scanner.next();
		     if(findMember(id)!=null)
		    	 System.out.println("이미 존재하는 id입니다.");
		     else
		    	 break;
		  }while(true); 
		
		//회원비밀번호
		  System.out.println("비밀번호>");
		  String password=scanner.next();
	 
		//회원이름
		  System.out.println("이름>");
		  String name=scanner.next();
	     //회원추가
		  memberArray.add(new Member(id, password, name));
}
	//회원리스트 보기
	private static void memberList() {
	 //작성위치
		for(Member m:memberArray) {
	    	  System.out.println(m);
	    }
	}

	//포인트 적립
	private static void deposit(){
	  //회원 찾기		
		  System.out.println("id>"); 
		  String id=scanner.next(); //입고
		  System.out.println("적립포인트>"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
		     member.setPoint(member.getPoint()+point); 
		  }else { 
			 System.out.println("해당 회원이 없습니다."); 
		 }
	}

	//포인트 차감
	private static void withdraw(){
		//회원 찾기		
		  System.out.println("id>"); 
		  String id=scanner.next(); //입고
		  System.out.println("적립포인트>"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
			  if(member.getPoint() - point<0) {
				  System.out.println("포인트를 차감할수 없습니다.");
			  }else {
		         member.setPoint(member.getPoint() - point);
			  }
		  }else { 
			 System.out.println("해당 회원이 없습니다."); 
		 }
	}

	
	
	  //StockArray 배열에서 itemCode와 동일한 Item 객체 찾기
	private static Member findMember(String id){
      for(Member member:memberArray) {
    		  if(member.getId().equals(id)) return member;
      }
	 //작성위치
      return null;
	}	
	
	//메뉴출력
  static void printMenu() {
	System.out.println("------------------------------------------------------");
	System.out.println("1.회원등록 | 2.회원목록 | 3.포인트적립| 4.포인트차감|5.비번변경 | 6.종료");
	System.out.println("------------------------------------------------------");
  }

	 
}
