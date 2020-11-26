package ch13_02;

public class MyMath {
	//같은 이름의 메소드가 매개변수의 타입,갯수만 다르게 선언됨 - 메소드 오버로딩
	int plus(int x, int y) {
		return x+y;
	}
	//변수명은 메소드 오버로딩과 무관함.
	//int plus(int a, int b) {
	//	return x+y;
	//}
	double plus(double x, double y) {
		return x+y;
	}
	
}
