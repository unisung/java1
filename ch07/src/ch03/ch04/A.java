package ch03.ch04;

//부모생성자 선택 호출 메소드 super(매개변수)
public class A {
	public A() {System.out.println("기본생성자 A");}
	public A(int x) {System.out.println("매개변수 x 생성자 A");}
}
class B extends A{
	//부모클래스의 기본생성자 호출
	public B() {
	    super(10);//부모클래스의 매개변수있는 생성자 선택 호출	
		System.out.println("기본생성자 B");
	}
	//부모클래스의 기본생성자 호출
	public B(int x) {System.out.println("매개변수 x 생성자 B");}
}




