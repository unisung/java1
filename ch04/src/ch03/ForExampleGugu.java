package ch03;

import java.util.Scanner;

public class ForExampleGugu {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("출력을 원하는 단수를 입력하세요:(2~9)");
	 int dan=scanner.nextInt();	
	 
	  for(int i=1;i<=9;i++) {
		  System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
	  }
		
	}
}
