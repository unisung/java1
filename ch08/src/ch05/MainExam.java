package ch05;
//인터페이스를 이요한 객체의 다형성
public class MainExam {
	public static void main(String[] args) {
      MyInterFace mi =new B();
      mi.action();
      
      mi=new C();
      mi.action();
      
      mi=new D();
      mi.action();
      
      mi=new E();
      mi.action();
      
     MyInterFace[] mis
     = {new B(),new C(),new D(),new E()};
     
     for(MyInterFace m:mis)
    	 m.action();
      
      
	}
}
