package ch08;

public class A extends Object{//모든자바객체는 Object상속받아 생성
	int a;
	public A() {//default생성자
		a=10;
		System.out.println("나는 생성자다,"+a);
		
	}//기본 생성자
	
	public A(int a) {
		this.a=a;
		System.out.println("나는 매개변수 1개짜리 생성자다,"+a);
	}
}
