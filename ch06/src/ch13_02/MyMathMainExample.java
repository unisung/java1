package ch13_02;

public class MyMathMainExample {
	public static void main(String[] args) {
		MyMath math=new MyMath();
		int result = math.plus(10, 20);
		System.out.println(result);
		
		//메소드를 호출하는쪽에서 매개변수타입의 값을 전달하면
		//해당 매개변수타입에 맞는 메소드를 찾아서 실행해줌.
		double dRes = math.plus(10.0, 10.5);

	}

}
