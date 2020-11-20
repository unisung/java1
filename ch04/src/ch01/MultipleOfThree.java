package ch01;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("수를 입력하세요:");
	 int number = scanner.nextInt();
	 
	 //if조건문 다음에 명령문이 하나면 {}생략가능.
	 if(number%3==0)
		 System.out.println("3의 배수");
	 else
		 System.out.println("3의 배수가 아님");
	 

	 scanner.close();
	}
}
