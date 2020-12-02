package ch06;

public class A {
	public A() {
		this(10);
	}
	public A(int x) {
		System.out.println(x);
	}
}

class B extends A{
	public B() {
		super(10);
	}
	public B(int x) {
		super();
	}
}
