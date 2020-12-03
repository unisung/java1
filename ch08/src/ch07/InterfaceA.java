package ch07;

public interface InterfaceA {
  void method1();
  //default메소드
  default void method2() {}
  //static메소드
  static void method3() {}
}

class B implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}
class C implements InterfaceA{
	@Override
	public void method1() {	}
	//public void method2() {}
}
class D implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}