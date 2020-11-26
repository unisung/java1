package ch14;

public class CarMainExample {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="소나타";
		c1.color="white";
		
		Car c2=new Car();
		c2.name="그랜저";
		c2.color="red";
		
		Car c3=new Car();
		c3.name="아반테";
		c3.color="blue";

		//non-static맴버의 호출
		//객체 생성 후
		// 참조변수.맴버명
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
		
		//static맴버의 호출
		//클래스명.맴버명
		Car.Calc();

	}

}
