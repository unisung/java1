package ch06;

public class MyInterMainExam {
	public static void main(String[] args) {
		//인터페이스 참조변수에 인터페이스로 구현된 모든 객체 대입가능
		//참조변수가 가리키는 객체가 상황에 따라 다른객체가됨.
		MyInterface mi=new M1();
		mi=new M2();
		mi=new M3();
		
		//이름이 없는 인터페이스 구현체
		mi=new MyInterface() {};
		
	}

}
