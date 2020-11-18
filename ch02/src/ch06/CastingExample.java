package ch06;

//범위가 넓은 데이타 타입에서 범위가 좁은 데이타 타입으로 강제 변환시 데이타 손실 위험
public class CastingExample {

	public static void main(String[] args) {
		 int intValue1=100;
		 byte byteValue1=(byte)intValue1;
		 System.out.println(byteValue1);
		 
		 intValue1=103029759;
		 byteValue1=(byte)intValue1;
		 System.out.println(byteValue1);
		 
		 short shortValue=(short)intValue1;
		 System.out.println(shortValue);

	}

}
