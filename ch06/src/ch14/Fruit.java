package ch14;

public class Fruit {
	//static필드
	static int amount=10;
	
	//생성자
	Fruit(){
		--amount;
	}
	
	//
	static void Rest() {
		System.out.println(amount);
	}
	
	
	

}
