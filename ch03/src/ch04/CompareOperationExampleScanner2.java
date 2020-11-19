package ch04;

import java.util.Scanner;

public class CompareOperationExampleScanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean play =true;
		
	while(play) {	
		System.out.println("확인할 문자를 입력하세요.>");
		
		char c = scanner.next().charAt(0);//스캐너로 입력된 문자열 중 첫번째 문자하나추출.
		
		if(c>='A' & c<='Z') {
			System.out.println("대문자입니다.");
		}else if(c>='a' & c<='z') { 
			System.out.println("소문자입니다.");
		}else if(c>='0' & c<='9') {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("기타문자입니다.");
		}
		
	   System.out.println("계속할까요?");
	   String yesNo=scanner.next();
	   //비교연산 기본타입에서 사용하여 값 비교할수있음.
	   //if(yesNo=='n' || yesNo=='N') play=!play;
	   //참조타입은 비교연산자로 값비교 불가
	   // 변수.equals(값) <- 변수의 값과 비교대상값이 같은지 비교하는 메소드
	   if(yesNo.equals("n") || yesNo.equals("N")) play=!play;
	   
	}//while문 끝.	
		System.out.println("종료");
	}
}
