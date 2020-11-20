package ch01;

public class ifDiceExample {

	public static void main(String[] args) {
		//Math.random()함수의 범위 0.0<= <1.0
		//System.out.println(Math.random());
	  int num=(int)(Math.random()*6)+1;//0+1~5+1
	  //System.out.println(num);
	  if(num==1) {
		  System.out.println("숫자1이 나왔습니다.");
	  }else if(num==2) {
		  System.out.println("숫자2가 나왔습니다.");
	  }else if(num==3) {
		  System.out.println("숫자3이 나왔습니다.");
	  }else if(num==4) {
		  System.out.println("숫자4가 나왔습니다.");
	  }else if(num==5) {
		  System.out.println("숫자5가 나왔습니다.");
	  }else if(num==6) {
		  System.out.println("숫자6이 나왔습니다.");
	  }
	  

		
	}

}
