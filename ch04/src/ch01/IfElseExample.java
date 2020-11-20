package ch01;

//if-else문 둘 중 하나의 경우는 반드시 실행되어야하는 경우 사용.
public class IfElseExample {
	public static void main(String[] args) {
		 int n;
		 n=9;
		 //조건문(if)
		 if(n%2==0) {//조건부분이 true일때만 블럭내의 명령문 실행{}
			 System.out.println("짝수입니다.");
		 }else {//if블럭을 제외한 경우 else블럭 내의 명령문 실행
			 System.out.println("홀수입니다.");
		 }
		 
		//score가 60이상인 학생들에게만 pass여부를 알려줌.
		 int score=55;
		 if(score>=60) {//조건 true시 실행되는 블럭
			 System.out.println("pass");
		 }else {//조건 false시 실행되는 블럭
			 System.out.println("fail");
		 }
		 
	}
}
