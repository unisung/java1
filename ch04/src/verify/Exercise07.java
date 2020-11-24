package verify;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;//예금액을 저장할 변수 선언
		Scanner scanner = new Scanner(System.in);

	outter:	while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
            //입력값 
			String menu=scanner.next();
			switch(menu) {
			case "1": 
				     System.out.println("예금액>");
				     balance=scanner.nextInt();
				     break;
			case "2":
				     System.out.println("출금액>");
				     balance-=scanner.nextInt();//balance=balance-scanner.nextInt();
				     break;
			case "3": 
				      System.out.println("잔고>"+balance); 
			         break;
			case "4": break outter;//바깥쪽반복문까지 빠져나가기 
			}
		}

		System.out.println("프로그램 종료");

	}
}