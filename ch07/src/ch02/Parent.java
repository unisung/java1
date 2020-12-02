package ch02;

public class Parent {
	//생성자는 상속에서 제외됨.
	Parent(){
		System.out.println("Parent생성자 호출");
	}
}

class Child extends Parent{
	//상속을 하면 기본생성자에 super()메소드가 포함됨.
	Child(){
		super();
		System.out.println("Child생성자 호출");
	}
}
