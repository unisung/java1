package ch10;

public class Car {
    //고유상태
	String company="현대자동차";
	String model="그랜저";
	int maxSpeed=300;
	int year=2020;
	
	//현재 상태
	int currentSpeed=120;
	boolean endigneStart=true;
	
	//부품
	Body body;
	Engine engine;
	Tire tire;
}
