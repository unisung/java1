package ch11;

public class Member {
	//필드
	String name;
	int age;
	String address;
	String email;
	String phone;
	
	//생성자
	public Member() {};
	public Member(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public Member(String name, int age, String address, String email) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	public Member(String name, int age, String address, String email, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
	

}
