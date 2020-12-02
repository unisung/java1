package ch08.ch05.ch03;

public class Shape {
	protected String name;
	public void paint() { draw();}
	public void draw() {System.out.println(name);} 
	
 public static void main(String[] args) {
	Shape b=new Circle();   b.paint();//자식클래스의 draw()실행
}	
}

class Circle extends Shape{
  protected String name;
  @Override
  public void draw() {
	  name="Circle";
	  super.name="Shape";//정적바인딩(연결)-원래 부모의 변수에 내용저장
	  super.draw();//정적 바인딩-원래 부모의 내용을 실행
	  System.out.println(name);
  }
}
