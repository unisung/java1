package ch04;

import java.util.Scanner;

public class DoWhileExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//시작과 끝이 명확하지 않을 때 주로 사용
		boolean play=false;
		
		//do~while문은 처음부터 조건이 false라도 1회는 반드시 실행됨.
		do{
			System.out.println("hi");
			System.out.println("계속할까요?");
			if(scanner.next().charAt(0)=='n') {
				break;
			}
		}while(play);
		//while문.
		
		System.out.println("종료");

	}

}
