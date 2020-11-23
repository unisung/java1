package ch01;

public class JVMStackExample {
	public static void main(String[] args) {
		 char v1='A';//스택 실행 push('A')
		 
		 //블럭내에서 선언된 변수는 블럭끝나면 사라짐.
		 if(v1=='A') {//스택 실행
			 int v2 = 100; //push('100')
			 double v3 = 3.14;//push('3.14)
		 }//pop(); pop();
		 
		 boolean v4 = true;//스택 실행 //push(true)
	}//pop();pop();

}
