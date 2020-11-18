package ch03;

//jdk7 이후 숫자에 '_' 허용
public class LiteralExampleExceptions {

	public static void main(String[] args) {
		int price=20_100;
		long cardNumber=1234_5678_1357_9998L;
		long controlBits=0b10110100_01011011_1011001_111110000;
		long maxLong=0x7fff_ffff_ffff_ffffL;
		int age=2_____5;
		
		//int x=15_; 숫자뒤 _
		//double pi=3_.14; // . 앞/뒤 _
		//long idNum=981231_1234567_L; // 숫자뒤 _
		//int y=0_X15; // 0X사이 _
		
	    System.out.println(price);
	    System.out.println(controlBits);
	    System.out.println(maxLong);
	    System.out.println(age);
	    System.out.println(cardNumber);
	    

	}

}
