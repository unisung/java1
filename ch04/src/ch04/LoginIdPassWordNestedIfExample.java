package ch04;

import java.util.Scanner;
//id가 "hong", pwd가 "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	int count=1;//실패 횟수 카운트 변수 선언
	while(true)	{//반복
		System.out.println("id를 입력하세요:");
		String id = scanner.next();
		
		System.out.println("비밀번호를 입력하세요:");
		String password = scanner.next();
		
		if (!id.equals("hong")) {//로그인 실패
			System.out.println("id를 확인하세요.");
		}else {//로그인시 비번 확인 처리 
			if(password.equals("1234")) {
				System.out.println(id+"님 환영합니다.");
				break;//로그인 성공시반복블럭을 빠져나가는 명령문 break;
			}else {
				System.out.println("비밀번호를 확인하세요.");
			}
		}
		System.out.println((++count)+"회 실패");//실패 횟수 증가 
		if(count==5) {//실패횟수 체크 부분
			System.out.println("프로그램을 종료합니다.");
			break;//반복블럭을 빠져나가는 명령문 break;
		}
	}//while끝.
		// 사용한 스캐너 객체 자원 해제
		scanner.close();
	}

}
