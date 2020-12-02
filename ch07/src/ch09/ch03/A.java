package ch09.ch03;

public abstract class A {
	void method() {}//실체 메소드
	abstract void method2(); //추상메소드
}

abstract class B extends A{
	//추상메소드 추가
	abstract void method3();
} 
//추상클래스에 누적되어 선언된 추상메소드는
//실체클래스에서는 모두 재정의 되어야 한다.
class C extends B{
	@Override
	void method3() {	}
	@Override
	void method2() {	}
}




