package ch04;

public class Person {
  private String name;
  private int age;
  
  public void setName(String name) {
	  this.name=name;
  }
  
  public void setAge(int age) {
	  if(age<0) {
		  System.out.println("사람의 나이는 자연수여야합니다.");
	      return;//더이상 실행하지 말고 호출한 곳으로 되돌아가라는 명령어.
	  }
	  this.age=age;
  }
  
  public String toString() {
	  return name+","+age;
  }
  
	

}
