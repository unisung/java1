package ch01;

public class ExceptionExample1 {
	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		//예외 발생 미리 파악하여 회피하기
		if(y!=0) {
		   result=x/y;	
		}else
			System.out.println("계산불가");
		
		System.out.println("프로그램 종료");
	
	}
}
