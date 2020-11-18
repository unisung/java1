package ch01;

//다른패키지(ch02)에 있는 라이브러리용 클래스를 
//현재 폴더의 클래스에서 사용하기 위해 import문을 이용하여 선언
// import 패키지경로.라리브러리클래스명;
import ch02.MySystem;

//클래스의 전체 경로명: ch01.Caculator;

/* 주석: java프로그램은 클래스 내에 있는 메소드(method)의 명령어들로 실행됨. */
 class Calculator {
  //main메소드-프로그램의 시작점(출발점)
 public static void main(String[] args) {
		//정수타입의 변수를 선언 과 동시에 정수30을 저장
		//int result=10+20;//명령문하나
		 int result;//정수타입의 변수 선언
		 result=10+20;//정수타입 변수에 10+20을 한 정수 30을 저장.
		 /* */
		//정수타입 변수 result가 가리키는 저장공간의 값 30을
		//출력하라.
		System.out.println("결과:"+result);//명령문하나
		//Calculator의 전체 경로명
		System.out.println(Calculator.class.getName());
		
		//사용자가 만든 라이브러리클래스
		MySystem.mysystem.out.println("my결과:"+result);
	}
}
