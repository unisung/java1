package ch09.ch02;

//클래스내에 추상메소드가 존재하면
//해당 클래스는 무조건 추상클래스이다.
public abstract class A {
	void method() {}
	//선언부만 선언된 메소드 - 추상메소드
	abstract void absMethod();

}
//부모클래스의 추상메소드는
//실체 자식클래스에서 반드시 재정의 해야한다.
class B extends A{
	@Override
	void absMethod() {
      System.out.println("실체메소드");
	}
}
//추상클래스를 상속받은 클래스에서는 추상메소드 재정의 안해도 됨.
abstract class C extends A{}

//추상클래스를 상속받은 추상클래스의 실체클래스 에서도 추상메소드는 재정의 해야함.
class E extends C{
	@Override
	void absMethod() {System.out.println("실체메소드");	 }
}

