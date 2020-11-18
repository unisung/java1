package ch02_01;

public class MethodExample {
 public static void main(String[] args) {
	//리턴타입있는 메소드호출시 결과값을 받아서 처리
	int result1=method1(5); 
	System.out.println(result1);
	
	//void타입 메소드호출 메소드명호출
	method2(5);
	//값을 받않고 결과만 리턴하는 메소드 호출
	String message=method3();
	System.out.println(message);
	
	//매개값도 받지않고 리턴값도 없는 메소드 호출
	method4();
 }	
	//값을 입력받고 결과를 되돌려주는 메소드
	static int method1(int x) {
		return x+10;
	}
	
	//값을 입력받고 결과를 되돌려주지않는 메소드
	static void method2(int x) {
		System.out.println(x);
	}
	
	//값을 받지않고 결과만 되돌려주는 메소드
	static String method3() {
		return "결과만 되돌려주지요";
	}
	
	//값을 받지않고 결과도 되돌려주지않는 메소드
	static void method4() {
		System.out.println("값도안받고 되돌려주지도않음");
	}
	
	
	

}
