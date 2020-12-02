package ch08.ch05.ch02;

public class MethodOverridingEx {
	//메소드의 매개변수가 다양하게 변화됨(다형성)
	//다형성이 매개변수에서 나타남-매개변수의 다형성.
	static void paint(Shape p) {
		p.draw();
	}

	//재정의 메소드는 부모타입으로 변환되더라도 재정의된 내용으로 실행
	//실행되는 시점에 자동으로 선택(동적 바인딩)
	public static void main(String[] args) {
		Shape s=new Shape();
		Line line=new Line();
		 s=line;
		 paint(s);
		 
		Rect r=new Rect();
		 s=r;
		paint(s);
		  
		s=new Circle();
		paint(s);
				
		//paint(line);
		//paint(new Shape());
		//paint(new Line());
		//paint(new Rect());
		//paint(new Circle());
	}
}
