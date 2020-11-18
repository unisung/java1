package ch01;

public class BitReverseOperationExample {

	public static void main(String[] args) {
	 int v1=10;//000000000000000000001010
	 int v2 =~v1;
	 int v3 =~v1+1;//비트연산 
	 //System.out.println(Integer.toBinaryString(10));
	 System.out.println(toBinaryString(v1));
	 System.out.println(toBinaryString(v2));
	 System.out.println(toBinaryString(v3));
	 System.out.println(v3);

	}
	
	//int타입의 값을 받아서 처리후 String타입으로 전달하는 메소드
	public static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
			System.out.println(str);
		}
		return str;
		
	}

}
