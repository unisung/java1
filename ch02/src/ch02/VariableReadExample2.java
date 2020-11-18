package ch02;

//객체타입인 문자열타입도 선언후 초기화 해줘야 읽을수 있음.
public class VariableReadExample2 {
	public static void main(String[] args) {
		//문자열 타입 변수를 선언
     String message;
     //문자열 타입 변수 초기화 하지않고 사용시 오류발생
     //System.out.println(message);
     
     //사용전 반드시 초기화
     message="hello World!!!";
     
     System.out.println(message);

	}

}
