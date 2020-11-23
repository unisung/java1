package ch08;

public class OperationExample2 {

	public static void main(String[] args) {
		byte b = -10;//-10 리터럴 -10
		//byte result = -b;//부호연산 -(-10) => +10; int타입으로 변환
		int result = -b;
		
		int x=10;
		int y=10;
		
		//증가 연산 1씩 증가, 단독 연산시  변수  앞,뒤 상관없이 1씩 증가
		x++;//후위
		System.out.println(x);
		++x;//전위
		System.out.println(x);
		
		//감소 연산 1씩 감소, 단독 연산시 변수 앞,뒤 상관없이 1씩 감소
		--y;//전위
		System.out.println(y);
		y--;//후위
		System.out.println(y);
		
		
		//++연산자가 변수x앞에 있는 경우 먼저 증가후 연산에 참여
		//++연산자가 변수y뒤에 있는 경우 이전의 값으로 연산에 참여 후 증가
		int z=++x + y++;
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		//논리연산
		//if문, 반복문의 조건으로 사용
		boolean b1 = true & false;//논리곱 왼쪽 & 오른쪽 결과 true/false
		
		b1 = 10>5 & 1!=1;// 10>5결과true, 1!=1 false, true & false결과는 false
		
		//몫, 나머지 연산 (%)
		//짝수,홀수
		int intValue=10;
		if(intValue%2==0) System.out.println("짝수");
		
		//자바의 int타입 연산결과는 int, int/int는 int 몫 계산
		int result3 = 534 / 12;
		System.out.println(result3);
		
		//삼항 연산 -if-else문을 대체한 식
		String result4 = intValue%2==0?"짝수":"홀수";
		System.out.println(result4);
		

	}
}
