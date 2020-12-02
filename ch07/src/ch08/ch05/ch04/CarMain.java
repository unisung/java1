package ch08.ch05.ch04;

public class CarMain {
	public static void main(String[] args) {
	  Car car=new Car();
	  //Tire타입 필드에
	  //자식클래스 KumhoTire()객체 대입
	  //필드의 다형성
	  car.tire=new KumhoTire();

	}
}
