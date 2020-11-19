package ch07;

public class ThreeConditionOperationExample {

	public static void main(String[] args) {
		int score=95;
		char grade = score>90?'A':'B';
		System.out.println("결과:"+grade);
		
		if(score>90) {
			grade='A';
		}else {
			grade='B';
		}
		System.out.println("결과:"+grade);
		
		//두수의 차이 계산
		int a=3,b=5;
		System.out.println("두수의 차는 "+((a>b?a-b:b-a)));
		

	}
}
