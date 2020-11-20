package ch01;

import java.util.Scanner;

public class LoginFailSuccessExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("id를 입력하세요:");
		String id = scanner.next();
		if (!id.equals("hong")) {
			System.out.println("id를 확인하세요.");
		}else {
			System.out.println(id+"님 환영합니다.");
		}

		// 사용한 스캐너 객체 자원 해제
		scanner.close();

	}

}
