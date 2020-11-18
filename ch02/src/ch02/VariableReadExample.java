package ch02;

// 메소드에 선언된 변수는 초기화 되어야 읽을수 있음!!!!!!!!!!!!!!!!!!!!!!!!!!
public class VariableReadExample {

	public static void main(String[] args) {
	    //정수타입 변수 선언 
		int value;
		//변수를 선언 후 초기화 하지않으면 
		//변수를 읽을 때(연산 혹은 출력시) 오류 발생
		value=30;
		
		int result=value+10;
		
		//함수의 매개변수로 전달될때도 변수는 초기화 되어야함.
		System.out.println(result+","+value);
	     
	}
}
