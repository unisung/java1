package ch02;

public class PrimitiveVsWrapperExample {
	public static void main(String[] args) {
		//기본타입은 값 만 저장, 함수가 없음
		int i=10;
		String result;
		
		 //참조타입 = 기본타입 값
		//result = i;
		
		//참조타입은 값 저장 도 하고 변형하는 함수도 존재
		Integer intValue = new Integer(10);
		result = intValue.toString();
		
		System.out.println(result);
		System.out.println(intValue.equals(10));
		
		
		
	}

}
