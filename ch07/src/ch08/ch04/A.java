package ch08.ch04;

public class A {
	int field1=0;
	void method1() {System.out.println("메소드A");}
	
}
class B extends A{
	//자식클래스(B)에서 추가된 필드 -부모필드에는 없던 필드
	int field2=10;
	//자식클래스(B)에서 추가된 메소드 -부모필드에는 없던 메소드
	void method2() {System.out.println("메소드B");}
}
