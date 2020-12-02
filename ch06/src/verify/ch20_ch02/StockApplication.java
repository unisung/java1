package verify.ch20_ch02;

import java.util.Scanner;

public class StockApplication {
	private static Item[] stockArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;//0
	
	  public static void main(String[] args){
	  boolean run=true;
	while(run){
	   System.out.println("--------------------------------------------");
	   System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
	   System.out.println("--------------------------------------------");
	   int selectNo = scanner.nextInt();
	 
	if(selectNo==1){
	  createItem();
	}else if(selectNo==2){
	  stockList();
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

	  //계좌생성하기
  private static void createItem(){
   //계좌번호 입력
	//  System.out.println("계좌번호>");
	//  String ano=scanner.next();
   //소유자 입력
	  System.out.println("소유자>");
	  String owner=scanner.next();
   //초기 금액 입력
      System.out.println("입금액>");
     int balance=scanner.nextInt();
    //Account객체 생성
    //String.format("포멧",값);
    //"포멧" -%03d <-십진수(digit) 3:전체 세자리, 0:빈공백은 0으로 채움
    Item acc =new Item("111-"+String.format("%03d",++seq), owner, balance);
    for(int i=0;i<stockArray.length;i++) {
    	 if(stockArray[i]==null) { 
    		 stockArray[i]=acc;
    		 break;
    	 }
    }

	}

	//계좌목록보기
	private static void stockList(){
	 //작성위치
		for(int i=0;i<stockArray.length;i++) {
	    	 if(stockArray[i]!=null) {
	    		 Item acc=stockArray[i];
	    		 System.out.println(acc.getAno()+","
	    		            +acc.getOwner()+","+acc.getBalance()); 
	    	 }
	    }
	}

	//예금하기
	private static void deposit(){
		//계좌번호 찾기
     System.out.println("계좌번호");
     String ano=scanner.next();
     //입금액
     System.out.println("입금액");
     int balance =scanner.nextInt();
 
     Item acc=findItem(ano);    
     if(acc!=null) {
    	acc.setQty(acc.getQty()+balance);
     }else {
    	 System.out.println("해당계좌번호가 없습니다.");
     }
    
	}

	//출금하기
	private static void withdraw(){
		//계좌번호 찾기
	     System.out.println("계좌번호");
	     String ano=scanner.next();
	     //입금액
	     System.out.println("입금액");
	     int balance =scanner.nextInt();
	 
	     Item acc=findItem(ano);    
	     if(acc!=null) {
	    	 if(acc.getQty()-balance<0) {
	    		 System.out.println("출금액이 잔고보다 많습니다.");
	    		 return;
	    	 }
	    	acc.setQty(acc.getQty()-balance);
	     }else {
	    	 System.out.println("해당계좌번호가 없습니다.");
	     }
	}

	  //Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Item findItem(String ano){
      for(int i=0;i<stockArray.length;i++) {
    	  if(stockArray[i]!=null) {
    		  Item acc=stockArray[i];
    		  if(acc.getItemCode().equals(ano)) return acc;
    	  }
      }
	 //작성위치
      return null;
	}	


	 
}
