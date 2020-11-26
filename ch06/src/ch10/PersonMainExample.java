package ch10;

public class PersonMainExample {
public static void main(String[] args) {
	Person person = new Person();
	//person.age=20;
	person.car.company="현대자동차";
	person.car.endigneStart=true;
	
	System.out.println(person.age);
	System.out.println(person.car.endigneStart);
	
}
}
