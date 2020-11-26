package ch08_01;

//자바에서 모든 클래스는 최상위클래스인 Object클래스를 상속받아서 생성
public class A /*extends Object */{ //<-extends Object코드는 컴파일시 추가
	public A() {System.out.println("A생성자호출");}//default(기본) 생성자 -역할 :객체 생성시 초기화역활
	
	 public static void main(String[] args) {
		  B b = new B();//소스파일에는 없지만 컴파일시 기본생성자 B()가 추가되어서 호출가능.
		  A a = new A();
	}	

}

class B{
	//public B() {}	//컴파일러가 기본 생성자 추가해줌 -모든 클래스는 생성자가 존재
	
}