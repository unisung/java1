package ch13_01;

public class ReferencePassing2 {
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		
		//call by reference
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	
	//호출시 매개변수로 참조하는 번지값이 전달됨.
	static void increase(Circle p) {//pizza변수가 가리키는 객체의 주소를 전달받음.
			
		Circle newPizza = new Circle(p.radius);
		newPizza.radius++;
	}
}

