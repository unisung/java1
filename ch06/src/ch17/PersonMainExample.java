package ch17;

public class PersonMainExample {
	public static void main(String[] args) {
      Person p1 = new Person("20010101-1100012", "홍길동");
      Person p2 = new Person("20010202-2100013", "유관순");
      
      //상수 이므로 수정불가
      //p1.nation="usa";
      
      System.out.println(p1.nation+","+p1.ssn+","+p1.name);
      System.out.println(p2.nation+","+p2.ssn+","+p2.name);
      

	}

}
