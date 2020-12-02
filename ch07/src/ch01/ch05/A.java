package ch01.ch05;

public class A {
	private int x;//private이기 때문에 외부에서 접근불가
	public int getX() {//public이므로 외부에서 getX()접근가능, getX()에서 x에 접근가능
		return x;
	}
}

//상속으로 접근
class B extends A{
	void method() {
		//System.out.println(x);
		System.out.println(getX());
	}
}
