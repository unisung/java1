package ch08.ch05.ch06;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

//참조변수 instanceof 객체 <- 참조변수가 가리키는 객체가 오른쪽 객체로 변환가능한지
//확인하는 연산자 ,
//변환 가능하면 true, 불가능하면 false
public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.println("Person ");
		if(p instanceof Student)
			System.out.println("Student ");
		if(p instanceof Researcher)
			System.out.println("Researcher ");
		if(p instanceof Professor)
			System.out.println("Professor ");
		System.out.println();
	}
  public static void main(String[] args) {
	  System.out.println("new Student()->\t"); print(new Student());
	  System.out.println("new Researcher()->\t"); print(new Researcher());
	  System.out.println("new Professor()->\t"); print(new Professor());
  }
}
