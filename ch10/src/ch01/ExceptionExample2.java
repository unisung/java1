package ch01;

public class ExceptionExample2 {
	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		try {
	      result=x/y;
		}catch(Exception e) {
		  System.out.println("예외발생");
		}
		//catch절에서 예외처리를 하게되면 여기까지 정상 진행 됨.
		System.out.println("프로그램 종료");
		
	}
}
