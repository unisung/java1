package ch06;

public class BitOperationExample2 {

	public static void main(String[] args) {
		byte flag=0b00001010;//각 비트는 8개의 센서 값을 가리킴
		
		//   0b00001010
		// & 0b00001000
		//   0b00001000
		if((flag & 0b00001000)==0) {
			System.out.println("온도는 0도 이하");
		}else
			System.out.println("온도는 0도 이상입니다.");
	}
}
