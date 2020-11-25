package ch02;

//포함관계
public class Car extends Steel{//Car extends Steel에 의해 상속관계가 이루어짐
	String model;
	Engine engine=new Engine();
	Tire tire=new Tire();
    Handle handle=new Handle();
}
