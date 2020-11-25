package ch12;

public class EnumUseExample {
	public static void main(String[] args) {
	 //작성한 사용자 정의 타입 변수 선언
	Week today;
	//사용자 정의 변수에 사용자 정의 값(리터럴) 대입;
	today=Week.TUE;
	
	System.out.println(today.ordinal());//index번호 출력
	System.out.println(today.name());//열거상수객체명을 문자열로 출력
	
	Week[] arr=today.values();//사용자 정의 객체내의 열거상수들을 배열로 출력
	for(Week w:arr) {
		System.out.println(w);
	}
	//today 값 저장
	today =Week.valueOf("SAT");//문자열값을 열거타입(Week)으로 변환하는 메소드
	
	System.out.println(today);
	
	Week day1=Week.MON;
	Week day2=Week.THU;
	
	//열걱개체내의 열거 상수의 순서차를 출력하는 함수 compareTo()
	System.out.println(day1.compareTo(day2));
	System.out.println(day2.compareTo(day1));

	}
}
