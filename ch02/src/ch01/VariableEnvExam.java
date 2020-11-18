package ch01;

public class VariableEnvExam {

	public static void main(String[] args) {
		int price=1000;
		int $price=200;//특수문자중 $사용가능(필수)
		String _companyName="서울it";//특수문자 _사용가능(필수)
		
		/* 식별자는 대소문자를 구분함(필수) */
		String firstname="일지매";
		String firstName="임꺽정";
		
		/* 식별자 명명규칙(관례)-카멜표기법-합성어의 다음단어의 첫글자는 대문자로 표시 */
		int maxSpeed=210;// max+speed=> maxSpeed
		String carBodyColor="Red";//car + body + color=> carBodyColor
		
		//자바예약어는 식별자로 사용불가
		//int class=20; 자바예약어는 사용불가
		//int if=50; 자바예약어 사용불가
		//int true=10; true/false는 boolean타입의 값(리터럴) 사용불가
		//int null=100; null은 값이 지정되지 않았다는 의미의 리터럴 사용불가
		
		

	}

}
