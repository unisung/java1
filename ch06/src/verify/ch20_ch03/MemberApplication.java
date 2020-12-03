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
  private static void createItem(){
   //회원id
	  System.out.println("id>");
	  String id=scanner.next();
	//회원id
	  System.out.println("비밀번호>");
	  String password=scanner.next();
 
	//회원이름
	  System.out.println("상품명>");
	  String name=scanner.next();
     
	  for(int i=0;i<memberArray.length;i++)
		  if(memberArray[i]==null) {
	        memberArray[i]=new Member(id, password, name);
		  break;
		  }
	}

	//회원리스트 보기
	private static void stockList(){
	 //작성위치
		for(Member m:memberArray) {
	    	 if(m!=null)
	    		 System.out.println(m);
	    }
	}

	//입고처리
	private static void deposit(){
	  //상품번호 찾기
     System.out.println("상품번호");
     String itemCode=scanner.next();
     //입고
     System.out.println("입고량");
     int qty =scanner.nextInt();
 
     Item item=findItem(itemCode);    
     if(item!=null) {
    	 item.setQty(item.getQty()+qty);
     }else {
    	 System.out.println("해당 상품이 없습니다.");
     }
    
	}

	//출고하기
	private static void withdraw(){
		//상품번호 찾기
	     System.out.println("상품번호");
	     String itemCode=scanner.next();
	     //입금액
	     System.out.println("입금액");
	     int qty =scanner.nextInt();
	 
	     Item item=findItem(itemCode);    
	     if(item!=null) {
	    	 if(item.getQty()-qty<0) {
	    		 System.out.println("출고량이 현재고보다 많습니다.");
	    		 return;
	    	 }
	    	 item.setQty(item.getQty()-qty);
	     }else {
	    	 System.out.println("해당상품이 없습니다.");
	     }
	}

	  //StockArray 배열에서 itemCode와 동일한 Item 객체 찾기
	private static Item findItem(String itemCode){
      for(int i=0;i<stockArray.length;i++) {
    	  if(stockArray[i]!=null) {
    		  Item item=stockArray[i];
    		  if(item.getItemCode().equals(itemCode)) return item;
    	  }
      }
	 //작성위치
      return null;
	}	
	
	//메뉴출력
  static void printMenu() {
	System.out.println("--------------------------------------------");
	System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
	System.out.println("--------------------------------------------");
  }

	 
}
