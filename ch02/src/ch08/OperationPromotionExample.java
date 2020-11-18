package ch08;
//자바는 정수 연산일 경우 int타입으로 변환후 연산.
//피연산자를 4byte단위로 저장하기 때문.(byte,short,char,int) ->int
public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=byteValue1 + byteValue2;//int+int-> int
		int intValue=byteValue1 + byteValue2;//int + int -> int
		System.out.println(intValue);
		
		char charValue1='A';//66
		char charValue2=1;
		//char+char -> int+int -> int
		//char charValue3=charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		
		//출력시 char타입으로 강제 변환후 출력 가능
		System.out.println(intValue2);//int로 66,0x41
		System.out.println((char)intValue2);//문자로 B
		
		int intValue3=10;
		int intValue4=intValue3/4;//int/int ->int 
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0;//int/double ->double/double->double
		
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue);
		
		
		

	}

}
