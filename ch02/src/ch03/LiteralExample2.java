package ch03;

//실수 리터럴
//실수타입의 리터럴은
//java에서는 double타입을 기준 타입으로 간주함.
//-실수 숫자뒤에 f나 d가 없으면 무조건 double타입으로 간주
public class LiteralExample2 {
	public static void main(String[] args) {
		//실수리터럴 -고정소수점방식,부동소수점 방식
		double d=0.1234f;//고정소수점방식
		double e=1234E-4F;//부동소수점방식 1234*10^-4
		
		//단정도 실수(32bit)는 float
		float f=0.1234f;//숫자뒤에 f를 붙임
		//배정도 실수(64bit)는 double
		double w=.1234F;//숫자뒤에 d를 붙임
		

	}

}
