package ch01;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		int score = scanner.nextInt();
		if(score>=80) {
			System.out.println("축하드립니다.합격입니다.");
		}
		//사용한 스캐너 객체 자원 해제
		scanner.close();
	}
}
