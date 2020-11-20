package ch02;

public class SwitchExample1 {

	public static void main(String[] args) {
		//Math.random()함수의 범위 0.0<= <1.0
		//System.out.println(Math.random());
	  int num=(int)(Math.random()*6)+1;//0+1~5+1
	  System.out.println(num);
	  
	  switch(num) {
	  case 1: System.out.println("숫자1이 나왔습니다."); 
	          break;
	  case 2: System.out.println("숫자2가 나왔습니다."); 
	          break;
	  case 3: System.out.println("숫자3이 나왔습니다."); 
	          break;
	  case 4: System.out.println("숫자4가 나왔습니다."); 
	          break;
	  case 5: System.out.println("숫자5가 나왔습니다."); 
	          break;
	  default: System.out.println("숫자6이 나왔습니다."); 
	          break;
	  
	  }
	  

	}

}
