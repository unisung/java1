package ch07;

import java.util.Scanner;

public class ScannerInputExample {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸을 분리하여입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요>");
		String name=scanner.next();
		System.out.println("거주지를 입력하세요>");
		String city=scanner.next();
		System.out.println("나이를 입력하세요>");
		int age=scanner.nextInt();
		System.out.println("몸무게를 입력하세요>");
		double weight=scanner.nextDouble();
		System.out.println("독신여부(true/false)를 입력하세요>");
		boolean single=scanner.nextBoolean();
		
		System.out.println("이름:"+name+",거주지:"
		                    +city+",나이:"+age+",몸무게:"
				            +weight+",독신여부:"+(single?"싱글":"기혼"));
		//자원해제
		scanner.close();
	}
}
