package ch09;

//필드,생성자, 메소드가 없는 소스코드 =>컴파일 후 class파일에는 기본생성자 A(){}는 생성됨.
public class A {
	//public A(int a) {}
	
}

//필드만 있는 소스코드 => 컴파일 후 class파일에 int field1과 B(){} 생성됨.
class B{
	//필드
	int field1;
}

//필드와 메소드만 있는 소스코드 =>컴파일 후 class파일에 field와 C(){}와 method1(){}생성됨.
class C{
	int filed1;
	void method1() {}
}
/* 클래스의 구성 맴버 - 필드, 생성자, 메소드 */
//필드와 메소드와 생성자 모두 있는 소스코드 => 컴파일 수 class파일에 field, d(){}, method(){}생성.
class D{
	int field;//맴버필드
	D(){}//생성자
	void method() {}//맴버메소드
}