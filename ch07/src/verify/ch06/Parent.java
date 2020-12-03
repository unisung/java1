package verify.ch06;

public class Parent{

    public String nation;

    public Parent(){
    this("대한민국");//Parent(nation)을 먼저 호출함
      System.out.println("Parent() call");//실행2
    }

 
   public Parent(String nation){
   this.nation=nation;
   System.out.println("Parent(String nation) call");//실행1

   }

}