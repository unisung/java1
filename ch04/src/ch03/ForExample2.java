package ch03;

public class ForExample2 {

	public static void main(String[] args) {
	
	//반복 블럭을 빠져나가는 조건이 상수값인 true로 되어있어 false로 바뀌지 않음
	/*	for(int i=1;true;i++) {
			System.out.println(i);
		}
	*/	
	//반복 블럭을 빠져나가는 조건부분이 비어 있어서 false로 될수 없음.	
		for(int i=1; ;i++) {
			System.out.println(i);
		}

	}
}
