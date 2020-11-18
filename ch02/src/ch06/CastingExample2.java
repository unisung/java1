package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		int intValue=10;
		double doubleValue=5.5;
		
		//int10 ->double 10.0
		double result = intValue + doubleValue;
		System.out.println(result);

		//double ->int 5
		int result2 = intValue+(int)doubleValue;
		System.out.println(result2);
	}

}
