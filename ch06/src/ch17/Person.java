package ch17;

public class Person {
	final static String nation="Korea";//상수는 선언과 동시에 초기화 해주어야함.
	final String ssn;//생성자에서 초기화부분이 있어서 문법오류가 아님
	String name;
	
	public Person(String ssn,String name) {
		this.ssn=ssn;//생성자에서 초기화 부분이 있어서 위쪽 선언부에서 오류나지 않음.
		this.name=name;
	}

}
