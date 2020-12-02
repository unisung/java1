package ch07.ch05;

public class B {
	//메소드앞에 final을 붙이면 상속받은 자식클래스에서 재정의 불가
	final void method() {
		System.out.println("메소드B");
	}
}

class C extends B{
	//void method() {
	//	System.out.println("메소드C");
	//}
}