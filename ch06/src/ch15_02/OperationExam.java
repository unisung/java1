package ch15_02;

import java.util.Scanner;

public class OperationExam {
  public static void main(String[] args) {
  //console로 부터 문자열을 입력받는 객체 생성
  Scanner scanner = new Scanner(System.in);
  System.out.println("연산 프로그램입니다. 두개의 값과 연산자를 입력하세요 예) 10 + 20");
  
  
  int num1 = scanner.nextInt();
  char op = scanner.next().charAt(0);
  int num2 = scanner.nextInt();
  
  switch(op) {
  case '+': System.out.println(num1 + num2); 
            break;
  case '-': System.out.println(num1 - num2);
            break;
  case 'x': System.out.println(num1 * num2);
            break;
  default: 	System.out.println(num1 / num2); 
            break;
  }
    //자원해제
    scanner.close();

	}
}
