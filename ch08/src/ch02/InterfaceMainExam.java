package ch02;

public class InterfaceMainExam {
	public static void main(String[] args) {
		//실체 구현제를 new로 생성불가
		//MyInterface mi=new MyInterface();
		MyInterface mi=new MyClass();
		//인터페이스도 클래스처럼
		//실체클래스에서 재정의한 메소드 내용이 실행됨.
		mi.method();
	}
}
