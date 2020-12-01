package ch20.r.ch01;

import ch20.r.B;

public class A {
	void f() {
		B b=new B();
		
		//다른패키지에서는
		//protected접근자는
		//default접근자와 같이
		//접근불가
		//b.n=3;
		//b.g();
	}

}
//D와 B는 상속의 관계
class D extends B{
	//protected int n;
	//protected void g() {
	//	 n=5;
	// }

	//상속관계 클래스는
	//내부적으로 필드와 메소드가 
	//접근가능함.
	void f() {
		n=3;
		g();
	  //k=10;//private접근자는
		     //상속관계라도 접근불가
	}
}