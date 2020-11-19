package ch04;

//기본타입(byte,short,char,int,long,float,double,boolean)의
//비교연산 ==, != >,<,>=,<=
public class CompareOperationExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1==num2);//같은가?
		boolean result2 = (num1 !=num2);//다른가?
		boolean result3 = (num1 <=num2);//이상인가?
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 ='A';
		char char2 ='B';
 boolean result4 = char1 < char2;// 66 < 67-char타입 값은 연산시 int타입으로 변환.
		System.out.println(result4);

	}

}
