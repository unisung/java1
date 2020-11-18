package ch05;

public class PrimitiveTypeScopeExample {
	public static void main(String[] args) {
 //기본타입의 객체화 클래스:wrapper클래스 		
 //int->Integer, byte->Byte, char->Character, short->Short, long ->Long		
  System.out.println(Integer.MIN_VALUE+"<=int범위<="+Integer.MAX_VALUE);
  System.out.println(Byte.MIN_VALUE+"<=byte범위<="+Byte.MAX_VALUE);
  System.out.println(Character.MIN_VALUE+"<=char범위<="+Character.MAX_VALUE);
  System.out.println(Short.MIN_VALUE+"<=short범위<="+Short.MAX_VALUE);	
  System.out.println(Long.MIN_VALUE+"<=long범위<="+Long.MAX_VALUE);

  //float -> Float, double -> Double
  System.out.println(Float.MIN_VALUE+"<=float범위<="+Float.MAX_VALUE);
  System.out.println(Double.MIN_VALUE+"<=double범위<="+Double.MAX_VALUE);
	}

}
