package ch07.ch06.r;

import ch07.ch06.q.A;

public class B extends A{
	void sub() {
		pub=1;//public
		pro=2;//protected
		//def=3;//default
		//pri=4;//private접근불가
	}
}

class C{
	void sub() {
		A a=new A();
		a.pub=1;//public은 접근가능
//		a.pro=2;//상속관계가 아니면 접근불가
	}
}