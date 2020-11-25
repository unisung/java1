package ch01;

public class ExecutMainExample {

	public static void main(String[] args) {
		//차량생산
		Car c1=new Car();
		c1.color="red";
		c1.speed=200;
		
		Car sonata =new Car();
		sonata.color="white";
		sonata.speed=250;
		
		sonata.run();//참조하는 객체의 메소드 실행 -메소드 호출로 실행
		sonata.stop();
	}

}
