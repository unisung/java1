package ch08;

public class OperationExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue2 =20;
		
		//byte,short,char,int 타입은 연산식에 참여시 모두 int타입을 변환
		//byte result = byteValue + byteValue2;
		int result=byteValue + byteValue2;
		
		
		//형변환:기본데이타 타입(byte<short<int<long<float<double)
		//저장크기가 작은 데이타 타입은 큰 타입으로 자동 형변환
		//저장크기가 큰 데이타 타입은 작은 타입으로 강제 형변환해줘야한다.
		double result2 = 10/2.0;//int/double -> double/double->10.0/2.0
		System.out.println(result2);
		
		//문자열과 다른 기본타입과의 연산결과는 무조건 문자열 타입
		String str="jdk";
		String message = str+3+3.0; //문자열+int+double-> 문자열+문자열+double("jdk"+"3"+3.0)-> 문자열+문자열+문자열("jdk33.0")
		System.out.println(str+(3+3.0));//"jdk6.0"

	    	
	}
}
