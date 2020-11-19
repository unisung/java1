package ch06;

public class BitOperationShift {
	public static void main(String[] args) {
	 short a = (short)0x55ff;
	 short b = (short)0x00ff;
	 System.out.println(toBinaryString(a));
	 System.out.println(toBinaryString(b));
	 
	 //비트 논리 연산
	 System.out.println("[비트 연산 결과]");
	 System.out.printf("%04x\n",(short)(a&b));//비트 AND
	 System.out.printf("%04x\n",(short)(a|b));//비트 or
	 System.out.printf("%04x\n",(short)(a^b));//비트 xor
	 System.out.printf("%04x\n",(short)(~a));//비트 not

	}
	
	static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
	 while(str.length()<16) {
		  str="0"+str;
	 }
	 return str;
	}

}
