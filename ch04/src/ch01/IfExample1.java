package ch01;

public class IfExample1 {
	public static void main(String[] args) {
		//
	 int n;
	 n=9;
	 //조건문(if)
	 if(n%2==0) {//조건부분이 true일때만 블럭내의 명령문 실행{}
		 System.out.println("짝수입니다.");
	 }
	 
	 //score가 60이상인 학생들에게만 pass여부를 알려줌.
	 int score=67;
	 if(score>=60) {
		 System.out.println("pass");
	 }
			 
	
	}
}
