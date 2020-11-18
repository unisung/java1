package ch02;

import java.util.Scanner;

public class ArithmaticOpExample4 {
	public static void main(String[] args) {
		//키보드로 부터 값 읽어 들이는 객체 생성
		Scanner scanner = new Scanner(System.in);
		int time;
		
		System.out.println("출력을 원하는 초를 정수단위로 입력하세요:");
		time=scanner.nextInt();//입력된 값을 숫자(int)로 변환하여 변수에 저장
		
		int second=time%60;//초
		int minute=(time/60)%60;//분
		int hour =(time/60)/60;//시간
		
		System.out.println(time+"초는");
		System.out.println(hour+"시간,");
		System.out.println(minute+"분,");
		System.out.println(second+"초입니다.");
		
		

	}

}
