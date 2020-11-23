package ch02;

public class EqualsExample {

	public static void main(String[] args) {
		A a=new A();
		A a2=new A();
		if(a==a2) System.out.println("a와 a2는 주소가 같다");
		else System.out.println("a와 a2는 주소가 다르다");
		
		//동등비교(equivalant)
		if(a.equals(a2)) {
			System.out.println("a와 a2가 가리키는 객체의 값이 같다.");
		}else {
			System.out.println("a와 a2가 가리키는 객체의 값이 다르다.");
		}

	}

}
