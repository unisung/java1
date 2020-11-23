package ch05;

public class ArrayDeclareNotValuesExample {

	public static void main(String[] args) {
		//타입[] 변수 =new 타입[길이];
		int[] intArr = new int[5];
		//length는 생성시 만들어짐 
		System.out.println(intArr.length);
		
		//값 저장- 0부터 배열.length-1까지만 저장가능
		 intArr[0]=10;
		 intArr[1]=20;
		 intArr[2]=30;
		 intArr[3]=40;
		 intArr[4]=50;
		 //intArr[5]=60;
		 
		 //값 저장
		 for(int i=0;i<intArr.length;i++)
			 intArr[i]=((int)(Math.random()*6)+1);
		 //값 출력
		 for(int i=0;i<intArr.length;i++)
			 System.out.println(intArr[i]);
		

	}

}
