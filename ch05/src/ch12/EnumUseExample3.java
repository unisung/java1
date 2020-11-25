package ch12;

import java.util.Scanner;

public class EnumUseExample3 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("아이디를 입력하세요>");
	 
	  String id=scanner.next();
	  //메세지 출력(표준화)
	  if(id.equals("kim"))
		  System.out.println(LoginResult.LOGIN_SUCCESS);
	  else
		  System.out.println(LoginResult.LOGIN_FAILED);
	}
}
