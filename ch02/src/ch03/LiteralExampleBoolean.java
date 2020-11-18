package ch03;

//boolean타입의 리터럴은 true/false 2개 뿐임.
public class LiteralExampleBoolean {

	public static void main(String[] args) {
		//boolean타입 변수 선언 후 true리터럴 저장
		boolean a=true;
		//boolean타입 변수 선언 후 초기값으로 연산의 결과값 true저장
		boolean b=10<0;  //int result=value+20;
		//boolean타입 변수에는 int타입의 값 저장 불가
		//boolean c=1;
		
		System.out.println("b:"+b);
		
		//조건문에서 참이면 블럭부분을 실행, 거짓이면 블럭부분을 지나침.
		if(a) {
			System.out.println("hello!! a가 true입니다.");
		}
		
		int i=1;
		//반복문
		while(a) {
			System.out.println("hi");
			//if 조건의 값이 참이면 블럭내의 a=false명령문 실행
			if(i==10) {//i의 값이 10과 같은지 비교하는 연산인 비교연산기호는 ==
				a=false;//값의 대입시는 =
			}
			i=i+1;
		}

	}

}
