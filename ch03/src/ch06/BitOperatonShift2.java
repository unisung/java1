package ch06;

public class BitOperatonShift2 {
	public static void main(String[] args) {
		byte c=20;//0x14;
		byte d=-8;//0xf8;
		
		//비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);//상위부호 1비트 1이 채워짐
		System.out.println(d>>>2);//0이 채워짐
		System.out.printf("%x\n",(d>>>2));
		

	}

}
