package ch06;

public class MethodExample {
	public static void main(String[] args) {
		

	}
	
	//1. 매개값 받고 , 결과를 돌려주는 함수 : 타입 메소드명(타입 변수){return 값;}
	int method1(int value) {
		return value+10;
	}
	
   //2. 매개값 받고, 결과를 되돌려주지않은 함수: void  메소드명(타입 변수){끝;}
	void method2(int[] value) {
		System.out.println(value);
	}
	
	//3.매개값 안받고, 결과만 되돌려주는 함수 : 타입 메소드명(){return 값;}
	int method3() {
		return 100;
	}
	
	//4. 매개값 안받고, 결과도 되돌려주지않는 함수: void 메소드명(){끝;}
	void method4() {
		System.out.println("결과는 여기서 출력하고 끝냄");
	}

}
