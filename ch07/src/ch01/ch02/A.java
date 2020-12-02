package ch01.ch02;

public class A {
	int field1;
	void method1() {}
}

class B extends A{
	int field2;
	void method2() {
		
	}
}
//누적된 field와 메소드 접근 
class C extends B{
	int field3;
	void method3() {
		field1=10;
		method1();
		field2=20;
		method2();
	}
}
//D클래스에는 field1, field2, method1(),method2()모두 포홤됨.
class D extends B{}

