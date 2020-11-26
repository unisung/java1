package ch10;

public class Person {
 //고유속성
String name;
String gender;
String birth;

//현재상태
int age;//클래스내에서 사용되는 맴버필드는 사용자가 초기화 하지 않으면 해당타입의 기본값으로 초기화됨

//부품
Car car=new Car();//객체타입의 필드 초기화

//기능-메소드
 void method() {
	 int i=0;//로컬변수(함수내에서 선언한변수)
	 System.out.println(i);//로컬 변수는 초기화 후 읽기 가능
 }

}
