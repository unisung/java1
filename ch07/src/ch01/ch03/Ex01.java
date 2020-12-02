package ch01.ch03;
// A3 -> A2 ->A1
class A1{
	int a1=34;
	void method1() {System.out.println("난 A1메소드");}
}
class A2 extends A1{
	int a2=10;
	void method2() {System.out.println("난 A2메소드");}
}

class A3 extends A2{
	void method3() {System.out.println("난 A3메소드");}
}

public class Ex01 {
 public static void main(String[] args) {
	 //부모나 조상클래스의 맴버를 자식클래스에 접근 가능
	A2 a2 = new A2();
	A3 a3 = new A3();
	A1 a1 = new A1();
	System.out.println("a1="+a2.a1);//A1을 상속받은 자식클래스 A2에서 A1의 맴버 접근가능
	System.out.println("a2="+a2.a2);//A2에서 추가된 A2의 맴버 접근가능
	a3.method1();//부모클래스의 맴버에 접근가능
	a3.method2();
	a3.method3();
	
	
}
}
