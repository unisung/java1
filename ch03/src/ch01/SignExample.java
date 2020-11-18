package ch01;

public class SignExample {
	public static void main(String[] args) {
		//부호연산 +,-부호
		//리터럴로 -100입력 가능
		byte x = -100;
		System.out.println(x);
		
		//변수연산시 결과는 int타입으로 변환
		//byte result1 = -x;
		//System.out.println(result1);
		int result1 = -x;//-(-100) => 100
		System.out.println(result1);
		//byte result2 = +x;
		int result2=+x;
		System.out.println(result2);
		

	}

}
