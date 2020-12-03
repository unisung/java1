package verify.ch07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		
		//부모참조변수에 자식객체를 대입하면
		//부모타입으로 자동형변환
		//이때, 부모타입에 있던 맴버(필드,메소드) 만 접근가능
		//자식클래스에서 메소드가 재정의 되었다면
		//부모타입의 클래스에서 실행되는 메소드의 결과는
		// 재정의된 자식클래스의 메소드내용
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
	}
}
