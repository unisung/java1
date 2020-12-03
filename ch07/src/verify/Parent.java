package verify;

public class Parent {
	public String name;
	//public Parent() {}
	public Parent(String name){
	   this.name=name;
	  }
}
//자식클래스에서 매개변수 생성자가 있더라도
//부모클래스의 기본생성자가 무조건 호출됨
//super()를 사용하거나
//부모클래스에 기본생성자 Parent()를 추가하면 됨.
class Child extends Parent{
   private int studentNo;
 public Child(String name, int studentNo){
	 super(name);
    this.name=name;
    this.studentNo=studentNo;
   }
 }