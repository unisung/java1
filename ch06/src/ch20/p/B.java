package ch20.p;

public class B {
	//클래스가 public이라도
	//클래스내의 맴버가 private이면 
	//동일패키지에서도 접근불가
	private int n;
	private void g() {
		n=5;
	}

}

class C{
	public void k() {
		//클래스는 public이므로
		//default생성자는 클래스의 접근지정자를 따름
		//기본생성자에는 접근 가능
		B b=new B();
		//private 필드 접근불가
		//b.n=7;
		//private메소드도 접근불가
		//b.g();
	}
}
