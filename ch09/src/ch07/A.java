package ch07;

public class A {
	//Parent field = new Parent();
	Parent field = new Child();
	void method() {
     field.chidleField=0;
     //field.newField=10;//자식클래스에서 추가된 맴버 접근불가
     //field.newMethod();//자식클래스에서 추가된 맴버 접근불가
	}
}

//추상클래스
abstract class Parent{
	int chidleField;
	void childMethod() {}
}
//상속객체
class Child extends Parent{
	int newField;//추가된 필드
	@Override
	void childMethod() {
     System.out.println("자식메소드");
	}
	void newMethod() {}//추가된 메소드
	
}