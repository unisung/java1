package ch08.ch05;

public class A {
	void method1() {System.out.println("메소드A");}
}

class B extends A{
	void method1() {System.out.println("메소드B에서 재정의된 내용");}
	void method2() {System.out.println("B에서 추가된 메소드");}
}