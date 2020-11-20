package ch01;

import java.util.Scanner;
//id가 "hong", pwd가 "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("id를 입력하세요:");
		String id = scanner.next();
		
		System.out.println("비밀번호를 입력하세요:");
		String password = scanner.next();
		
		if (!id.equals("hong")) {//로그인 실패
			System.out.println("id를 확인하세요.");
		}else {//로그인시 비번 확인 처리 
			if(password.equals("1234")) {
				System.out.println(id+"님 환영합니다.");
			}else {
				System.out.println("비밀번호를 확인하세요.");	
			}
		}

		// 사용한 스캐너 객체 자원 해제
		scanner.close();


	}

}
