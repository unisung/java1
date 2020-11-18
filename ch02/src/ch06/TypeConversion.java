package ch06;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		//byte +int -> int + int => int
		System.out.println(b+i);
		//int / int -> int
		System.out.println(10/4);// 10=2*4+2=>10은 몫이 2이고, 나머지가 2
		
		//54자루의 연필이 있습니다. 12명의 학생에게 몇자루씩 나누어주고, 남은 연필은 몇개인가요?
		//54=12*4+6, 54/12=4,
		System.out.println("몫:"+(54/12));
		System.out.println("나머지:"+(54-(54/12)*12));
		
		//double/int -> double/double(10.0)/4.0 -> 2.5
		System.out.println(10.0/4);
		//int ->char ->앞의 3byte는 사라짐, 마지막 2byte만 유효
		System.out.println((char)0x12340041);
		
		//int->byte로 변환시 오버플로우 발생
		System.out.println((byte)(b+i));
		
		//2.9->int타입 2 + 1.8 -> double 2.0 +1.8 -> 3.8
		System.out.println((int)2.9+1.8);
		
		//double+dobule(2.9+1.8=4.7) ->int 4
		System.out.println((int)(2.9+1.8));
	
		//double2.9->int 2, double 1.8 -> int 1, int +int 2+1=3 
		System.out.println((int)2.9+(int)1.8);
		

	}

}
