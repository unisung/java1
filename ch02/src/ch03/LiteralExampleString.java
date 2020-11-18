package ch03;

//String 리터럴
public class LiteralExampleString {
	public static void main(String[] args) {
	  //기본타입의 변수에 리터럴 저장하는것 처럼 값 대입
	  String str="Good";
	  //참조타입 값 설정하는 new 생성자() 호출방식으로 값 대입
	  String str2=new String("Good");
	  
	  System.out.println(str);
	  System.out.println(str2);
	  
	  //사용자정의 클래스 A를 선언하고 초기화
	  A a=new A();
	  //A a=10;
	  //A a="10";
		
	}
}
