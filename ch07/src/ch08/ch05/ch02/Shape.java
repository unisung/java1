package ch08.ch05.ch02;

public class Shape {
	public Shape next;//자신타입의 필드 선언
	public Shape() {//객체 생성시 필드 초기화
		next=null;
	}
	//부모맴버의 메소드 
    public void draw() {
	  System.out.println("Shape");	
	}
}

class Line extends Shape{
	public void draw() {//오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {//오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {//오버라이딩
		System.out.println("Circle");
	}
}
