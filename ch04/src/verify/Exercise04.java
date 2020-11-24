package verify;

//두개의 주사위를 던져서 합이 5가 나오는 경우 종료
public class Exercise04 {

	public static void main(String[] args) {
		int x=0,y=0;
	 
		//종료시점을 알수 없을 때 while문
	  while(true) {
		   x=(int)(Math.random()*6)+1;//1~6까지 무작위 자연수 숫자
		   y=(int)(Math.random()*6)+1;//1~6까지 무작위 자연수 숫자
		   if(x+y==5) break;//반복문을 빠져나가는 명령문 
		   System.out.println(x+","+y);
	  }
	  System.out.println(x+","+y);
		
		

	}

}
