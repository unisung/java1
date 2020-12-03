package verify.stock;

import java.util.Scanner;

public class StockApplication {
	private static Item[] stockArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;//0 자동발번용
	
   //어플리케이션 실행
  public static void main(String[] args){
	boolean run=true;
	while(run){
		printMenu();
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
//출고
private static void withdraw() {
	//상품코드
	  System.out.println("상품코드>");
	  String itemCode=scanner.next();
	 //출고할 수량 입력
	  System.out.println("출고수량>");
	  int qty=scanner.nextInt();
	  //상품찾기
	  Item item=findItem(itemCode);
	  if(item!=null) {//itemCode에 맞는 상품을 찾았을 때
		  if(item.getQty()-qty>=0) {
			  int tempQty=item.getQty();//원래재고 임시저장
			  item.setQty(tempQty-qty);//원래재고 - 출고수량을 저장
		  }else {
			  System.out.println("출고수량은 재고보다 적어야합니다.");
		  }
	  }else {//상품을 못찾았을 때
		  System.out.println("해당상품이 존재하지 않습니다.");
	  }
}
//입고
private static void deposit() {
	//상품코드
	  System.out.println("상품코드>");
	  String itemCode=scanner.next();
	 //입고할 수량 입력
	  System.out.println("입고수량>");
	  int qty=scanner.nextInt();
	  //상품찾기
	  Item item=findItem(itemCode);
	  if(item!=null) {//itemCode에 맞는 상품을 찾았을 때
		  int tempQty=item.getQty();//원래재고 임시저장
		  item.setQty(tempQty+qty);//원래재고 + 추가수량을 저장
	  }else {//상품을 못찾았을 때
		  System.out.println("해당상품이 존재하지 않습니다.");
	  }
}

//재고리스트
private static void stockList() {
	 //작성위치
	for(Item item:stockArray) {
    	 if(item !=null) {
    		 System.out.println(item.toString()); 
    	 }
    }
}
//코드에 맞는 상품찾기 메소드
private static Item findItem(String itemCode){
	for(Item item:stockArray) {
		if(item!=null)
			if(item.getItemCode().equals(itemCode)) 
				 return item;
	}
	return null;
}
//재고등록
private static void createItem() {
	//상품명
  System.out.println("상품명>");
  String name=scanner.next();
 //초기 재고 입력
  System.out.println("초기재고>");
  int qty=scanner.nextInt();
  
  //String.format("포멧",값);
  //"포멧" -%06d <-십진수(digit) 6:전체 세자리, 0:빈공백은 0으로 채움
  Item item =new Item("88"+String.format("%06d",++seq), name, qty);
  for(int i=0;i<stockArray.length;i++) {
  	 if(stockArray[i]==null) { //요소가 비어있으면 상품 저장, 비어있지 않으면 저장안함.
  		 stockArray[i]=item;
  		 break;//해당 index번지에만 저장하고 빠져나옴.
  	 }
  }
}
 private static void printMenu() {
  System.out.println("--------------------------------------------");
  System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
  System.out.println("--------------------------------------------");
 }
  
}
