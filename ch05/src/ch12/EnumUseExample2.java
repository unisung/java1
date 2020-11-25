package ch12;

import java.util.Scanner;

public class EnumUseExample2 {
	public static void main(String[] args) {
		//열거선언
		Blood blood;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("혈액형을 입력하세요(A,B,AB,O)>");
       
       blood = Blood.valueOf(scanner.next());
       
       System.out.println("입력한 혈액형은 : "+blood.name()+"타입입니다.");
		
	}
}
