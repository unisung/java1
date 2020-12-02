package ch07;

public class A {
	//default접근제한자 메소드
	void method1() {
		System.out.println("클래스A의 메소드");
	}
	
	void method2(int x) {
		System.out.println("클래스A의 메소드 ,"+x);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.method1();
	    B b= new B();
	    b.method1();
	    b.method2(10);
	}
}

class B extends A{
	//부모클래스의 메소드 타입,이름(매개변수)가 동일
	//method1()은 자식클래스에서 소스코드에
	//나타났으므로 재정의
	void method1() {}
	//method2()는 소스코드에서 숨어있으므로 재정의 아님
	
}


