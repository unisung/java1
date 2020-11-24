package verify;

//3의 배수의 총합 구하기
public class Exercise03 {
  public static void main(String[] args){
   //sum변수 선언
	 int sum=0;//초기화
	  
   for(int i=1;i<=100;i++) {//i는  for블럭내에서 선언, 종료후 사라짐
	  if(i%3==0) {//i의 값을 3으로 나눈 나머지가 0이면 3의 배수 
	     sum+=i;
	   }
   }
   //for문 밖에서 선언된 변수는 for문 밖에서 사용가능.
   System.out.println("총합:"+sum);

  }
}
