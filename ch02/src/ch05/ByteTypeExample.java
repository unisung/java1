package ch05;

public class ByteTypeExample {

	public static void main(String[] args) {
		byte b=127;
		//초기값으로 byte타입 변수에 저장 불가, byte범위 -128~127
		//byte c=128;
		
		System.out.println(b+1);//byte타입의 값+정수리터럴 => 정수타입 
		
		byte var1=-100;
		int var2=2147483645;
		short var3=32765;
		
		//증가연산의한 값의 변화
		for(int i=0;i<600;i++) {
			var1++;
			var2++;
			var3++;
			System.out.println("var1:"+var1+",var2:"+var2+",var3:"+var3);
		}
		
		

	}

}
