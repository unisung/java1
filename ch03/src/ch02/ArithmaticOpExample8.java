package ch02;

import java.util.Scanner;

public class ArithmaticOpExample8 {
	static int start,end;
	//키보드로 부터 값 읽어 들이는 객체 생성
    static Scanner scanner = new Scanner(System.in);
    static boolean play=true;
    
public static void main(String[] args) {
	 while(play) {	
		menu();
		looping();
		isRun();
	 }	
	 System.out.println("종료");
}
	
static void menu() {
		System.out.println("출력을 원하는 구간을 입력하세요(1~100):");
		System.out.println("시작숫자(1~100):");
		start = scanner.nextInt();
		System.out.println("종료숫자(1~100):");
		end = scanner.nextInt();
	}
	
static void looping() {
		for(int i=start; i<end;i++) {
			String str="";
			if(i/10%3==0 & i>10 ) str="짝";
			if((i%10)%3==0 & (i%10)!=0)str=str+"짝";//"짝짝"
			System.out.println(i+":"+str);
	  }
	}
	
static void isRun() {
	System.out.println("계속할까요?(y/n로 답하세요)");
	char yesNo =scanner.next().charAt(0);//스캐너로 입력받은 문자의 제일 첫번째 문자를 추출.
	if(yesNo=='n') play=!play;
	}
}
