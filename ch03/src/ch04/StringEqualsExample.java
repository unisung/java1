package ch04;

public class StringEqualsExample {
	public static void main(String[] args) {
		//기본타입 선언방식으로 초기화
		String str1 = "홍길동";
		String str2 = "홍길동";
		//참조타입 선언방식으로 초기화
		String str3 = new String("홍길동");
        
		//참조타입에서 ==연산자를 사용하면 참조번지가 같은지 여부를 물어봄
		System.out.println("str1과 str2가 가리키는 저장소가 같은가?"+(str1==str2));//366712642==366712642
		System.out.println("str1과 str3가 가리키는 저장소가 같은가?"+(str1==str3));//366712642==1829164700
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//객체 내용이 같으면 hashCode값이 같음.
		//참조타입의 내용비교 equals()메소드는 이 hashCode()값으로 같은지 다른지 비교함.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println();
		
		//참조타입에서 내용비교는 equals()메소드로 비교해야함.
		System.out.println("str1과 str2의 내용이 같은가?"+(str1.equals(str2)));// "홍길동"과 "홍길동"내용비교
		System.out.println("str1과 str3의 내용이 같은가?"+(str1.equals(str3)));// "홍길동"과 "홍길동"내용비교
		

	}

}
