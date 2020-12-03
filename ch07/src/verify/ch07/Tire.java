package verify.ch07;

public class Tire{
  public void run(){
	   System.out.println("일반 타이어가 굴러값니다");
	}
}
//재정의
class SnowTire extends Tire{
	   @Override
	    public void run(){
	   System.out.println("스노우 타이어가 굴러값니다");
	}
} 