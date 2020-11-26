package ch14;

public class Car {
	//필드
	static int seq;//static맴버
	//static맴버
	//1.생성되는게 아니고 로딩됨.-객체생성과 무관하게 사용가능
	//2.해당클래스에서 유일하게 하나만 생성
	//3.해당클래스의 모든 객체가 공유할수 있음. 
	//non-static맴버
	String name;
	String color;
	int no;
	//생성자
	public Car() {
		no = seq++;
	}
	//메소드
	//static맴버
	static void Calc() {
		System.out.println(seq+"대");
	}
	//non-static맴버
	void carInfo() {
		System.out.println(no+",name:"
	               +name+",color:"+color);
	}
}
