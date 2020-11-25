package ch06;

public class AMainExample {
  public static void main(String[] args) {
	//부모객체 참조변수에는 부모객체에서 상속받은 모든 객체는 대입가능
	A a=new A();
	a=new B();
	a=new C();
	a=new D();
	
	B b=new C();
	b = new D();
	
	C c=new D();
  }
}
