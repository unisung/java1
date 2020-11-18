package ch08;

//강제 타입 변환 전 오버플로우 여부 확인
public class CheckBeforeCasting {

	public static void main(String[] args) {
		int i=125;
		
		if(i<Byte.MIN_VALUE ||i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환 불가");
			System.out.println("값을 다시 확인하세요");
		}else {
			byte b=(byte)i;
			System.out.println(b);
		}
		
		///
		long j=2147483649L;
		if(j<Integer.MIN_VALUE || j>Integer.MAX_VALUE) {
			System.out.println("int타입으로 변환 불가");
		}else {
			int k=(int)j;
			System.out.println(k);	
		}

	}
}
