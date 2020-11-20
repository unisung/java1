package ch04;

import java.io.IOException;

public class WhileKeyConditionExample {
	public static void main(String[] args) throws IOException {
		boolean run=true;
		int speed=0;
		int keyCode=0;
		
		while(run) {
			//메뉴 출력
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("----------------");
				System.out.println("1.증속|2.감속|3.중지");
				System.out.println("----------------");
				System.out.println("선택:");
			}
			
			keyCode = System.in.read();//1byte의 값을 읽어 4byte int변수에 저장
			
			if(keyCode==49) {//ascii코드 1
				speed++;
			  System.out.println("현재속도="+speed);
			}else if(keyCode==50) {//ascii코드 2
				speed--;
			  System.out.println("현재속도="+speed);
			}else if(keyCode==51) {//ascii코드 3
				speed++;
			   run=!run;
			}
		}//while끝.
		System.out.println("종료");
	}
}
