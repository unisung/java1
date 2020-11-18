package ch02;

import java.util.Scanner;

public class ArithmaticOpExample5 {
	public static void main(String[] args) {
		//키보드로 부터 값 읽어 들이는 객체 생성
		Scanner scanner = new Scanner(System.in);
		int inputNumber;
		
		System.out.println("출력을 원하는 정수를 입력하세요(1~100):");
		inputNumber = scanner.nextInt();
		
		String str="";
		if(inputNumber/10%3==0 & inputNumber>10 ) str="짝";
		if((inputNumber%10)%3==0 & (inputNumber%10)!=0)str=str+"짝";//"짝짝"
		System.out.println(inputNumber+":"+str);
		
		

	}

}
