package ch03;

public class WrapperClassExample {

	public static void main(String[] args) {
	    //wrapper클래스 생성
		Integer iValue=new Integer(10);//new Integer(정수);
		Integer iValue2=new Integer("10");//new Integer("정수문자열");
		
		//Integer타입의 값을 String타입으로 변환 toString();
		String value=iValue.toString();//"10"
		
		System.out.println(value);
		
		//문자열 값 정수로 변환 valueOf("문자열 값");
		iValue = Integer.valueOf("200");
         
 		System.out.println(iValue);
		System.out.println(iValue.intValue());
		
		//wrapper클래스 정수값을 기본타입 int로 변환 intValue();
		int i=iValue.intValue();
		
		//기본타입 int값을 Wrapper클래스오 변환 new Integer(정수값);
		iValue = new Integer(i);
		

		
		

	}

}
