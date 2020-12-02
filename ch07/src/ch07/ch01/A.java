package ch07.ch01;

public class A {
	void method1() {}

}
//
class B extends A{
	@Override//메소드를 재정의 했다는 표시
	void method1() {
		System.out.println("재정의");
	}
	//메소드 오버로딩
	void method1(int x){}
}
