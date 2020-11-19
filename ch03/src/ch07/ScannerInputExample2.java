package ch07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerInputExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//토큰단위가 아닌 라인 단위로 입력받는 메소드 nextLine();
		String str =scanner.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		//추출하기
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		

	}

}
