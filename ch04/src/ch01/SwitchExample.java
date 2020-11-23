package ch01;

public class SwitchExample {

	public static void main(String[] args) {
		int time=10;
		
		//해당 case부터 누적 실행
		switch(time) {
		case 8: System.out.println("기상");
		case 9: System.out.println("출근");
		case 10: System.out.println("회의");
		case 11: System.out.println("외근");
		}
		
		//여러case를 누적해서 실행하지 않고
		//해당 case만 실행하는 경우, 해당 case에 break문 기술함.
		int score=85;//85/10 => 8
		switch(score/10) {//
		case 9:
		case 10: System.out.println("A");
		        break;
		case 8: System.out.println("B");
		        break;
		case 7: System.out.println("C");
		        break;
		default:System.out.println("F");
		}
		
	   	
		
		
	}
}
