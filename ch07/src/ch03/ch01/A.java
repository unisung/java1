package ch03.ch01;

public class A {
	public A() {System.out.println("기본생성자 A");}
	public A(int x) {System.out.println("매개변수 x 생성자 A");}
}
class B extends A{
	public B() {System.out.println("기본생성자 B");}
}


