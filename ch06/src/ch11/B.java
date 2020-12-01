package ch11;

public class B {
	int field1;
	//기본생성자 없고, 사용자 정의 생성자 존재
	public B(int field1) {
		this.field1=field1;
	}
 // 해당 클래스를 사용하는 클래스에서
 // 사용자 정의 생성자가 아닌
 // 기본생성자도 사용하려면
 // 기본생성자도 소스코드에 선언해야함.
	public B() {}
}
