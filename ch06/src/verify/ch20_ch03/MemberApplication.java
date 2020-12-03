package verify.ch20_ch03;

import java.util.Scanner;

public class MemberApplication {
	private static Member[] memberArray = new Member[100];
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
	  run=false;
	 }
	}
	System.out.println("프로그램 종료");
	}
 
	//회원 생성하기
	private static void createMember() {
		String id=null;
		//회원id
		do {  
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
	     
		  for(int i=0;i<memberArray.length;i++)
			  if(memberArray[i]==null) {
		        memberArray[i]=new Member(id, password, name);
			  break;
			  }
	
}
	//회원리스트 보기
	private static void memberList() {
	 //작성위치
		for(Member m:memberArray) {
	    	 if(m!=null)
	    		 System.out.println(m);
	    }
	}

	//포인트 적립
	private static void deposit(){
	  //회원 찾기		
		  System.out.println("id"); 
		  String id=scanner.next(); //입고
		  System.out.println("적립포인트"); 
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
		  System.out.println("id"); 
		  String id=scanner.next(); //입고
		  System.out.println("적립포인트"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
		     member.setPoint(member.getPoint() - point); 
		  }else { 
			 System.out.println("해당 회원이 없습니다."); 
		 }
	}

	  //StockArray 배열에서 itemCode와 동일한 Item 객체 찾기
	private static Member findMember(String id){
      for(Member member:memberArray) {
    	  if(member!=null)
    		  if(member.getId().equals(id)) return member;
      }
	 //작성위치
      return null;
	}	
	
	//메뉴출력
  static void printMenu() {
	System.out.println("----------------------------------------------");
	System.out.println("1.회원등록 | 2.회원목록 | 3.포인트적립| 4.포인트차감| 5.종료");
	System.out.println("----------------------------------------------");
  }

	 
}
