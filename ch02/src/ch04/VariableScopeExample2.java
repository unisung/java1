package ch04;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1=15;
		
		if(v1>10) {
			int v2=v1-10;
		}
		
		//main()메소드 내의 if블럭에서 선언된 변수 v2는 블럭을 벗어나서 사용불가
		//int v3=v1+v2+5;

	}
}
