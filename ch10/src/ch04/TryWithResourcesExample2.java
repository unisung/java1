package ch04;

import java.util.Scanner;

public class TryWithResourcesExample2 {
	public static void main(String[] args) {
		
		//try-with-resources절
		//try()내에서 선언가능한 객체의 조건
		//객체가 AutoCloseable해야함.
		try(Scanner scanner = new Scanner(System.in);) {
		System.out.println("메세지출력");
		String msg=scanner.next();
		System.out.println("입력내용:"+msg);
		}catch(Exception e) {
			
		}
     
	}
}
