package ch03.ch05;

//부모생성자 선택 호출 메소드 super(매개변수)
public class A {
	public A() {System.out.println("기본생성자 A");}
	public A(int x) {System.out.println("매개변수 x 생성자 A");}
	public A(int x,int y) {System.out.println("매개변수 x,y 생성자 A");}
	public A(int x,int y, int z) {System.out.println("매개변수 x,y,z 생성자 A");}
	
}
class B extends A{
	//부모클래스의 기본생성자 호출
	public B() {
	    super(10);//부모클래스의 매개변수있는 생성자 선택 호출	
		System.out.println("기본생성자 B");
	}
	//부모클래스의 기본생성자 호출
	public B(int x) {
		super(x,10,20);
		System.out.println("매개변수 x 생성자 B");}
	
	public B(int x, int y, int z) {
		this(x);
		System.out.println("매개변수 x, y, z 생성자 B");
	}
}




