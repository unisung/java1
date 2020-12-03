package ch04;

import java.util.Scanner;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("메세지출력");
		String msg=scanner.next();
		System.out.println("입력내용:"+msg);
		}catch(Exception e) {
			
		}finally {
			System.out.println("자원해제하기");
			scanner.close();
		}
     
	}
}
