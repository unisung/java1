package ch02;

public class A {
	//바깥쪽 A클래스의 맴버로서의 B클래스, static맴버
	static class B{
		B(){}//생성자
		int field1;
		static int field2;//static맴버 올수 있음
		void method1() {}
		static void method2() {}//static맴버 올수 있음
	}   
}

