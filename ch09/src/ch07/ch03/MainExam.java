package ch07.ch03;

public class MainExam {
	public static void main(String[] args) {
		Button button =new Button();
//람다식
//인터페이스의 추상메소드가 오직 한개
//재정의된 메소드의 실행부가 명령문이 하나면 블럭 {}생략가능
//선언부와 블럭사이에 화살표 -> 표시.
button.setOnClickListener(()->System.out.println("전화를 겁니다."));
	button.touch();
		
 button.setOnClickListener(()->System.out.println("메세지를 보냅니다."));
	button.touch();
		
	}
}
