package ch02;
//클래스의 전체 경로명: ch02.Caculator;

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
		//클래스의 전체 경로명 출력
		System.out.println(Calculator.class.getName());
		
		//사용자 정의 라이브러리 사용
		MySystem.mysystem.out.println("my결과:"+result);

	}
}
