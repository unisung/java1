package ch04;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//시작과 끝이 명확하지 않을 때 주로 사용
		boolean play=true;
		
		while(play) {
			System.out.println("hi");
			System.out.println("계속할까요?");
			if(scanner.next().charAt(0)=='n') {
				break;
			}
		}//while문.
		
		System.out.println("종료");

	}

}
