package ch08.ch05.ch06;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

//�������� instanceof ��ü <- ���������� ����Ű�� ��ü�� ������ ��ü�� ��ȯ��������
//Ȯ���ϴ� ������ ,
//��ȯ �����ϸ� true, �Ұ����ϸ� false
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