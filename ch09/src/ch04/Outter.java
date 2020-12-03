package ch04;

public class Outter {
	/* 로컬로 선언된 클래스에서 사용되는 변수는
	 * 상수여야만 한다.
	 * */
	void method(final int arg) {//java 8부터는 int arg로 선언해도 됨.그래도 상수
	  final int localVariable =1;//java 8부터는 int arg로 선언해도 됨.그래도 상수
	  //arg= arg+10;
	  //localVariable=200;
	  //내부클래스에서 사용되지 않는 변수는 사용가능
	  int i=10;
	  i=20;
		
	  //로컬 클래스
		class Inner{
			void method2() {
				int result=arg+localVariable;
			}
		}
	}

}
