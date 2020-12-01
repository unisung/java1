package ch20.ch01;

import ch20.p.B;

public class A {
	void f() {
		//클래스는 public이므로 생성자도
		//클래스의 접근자인 public을 따라
		//public이므로 다른패키지에서
		//접근가능
		B b=new B();
		//필드와 메소드는
		//private이므로 접근불가
		//b.n=3;
		//b.g();
		
		//C클래스는 default이므로
		//생성자도 default로써 접근불가
		//C c=new C();
	}

}
