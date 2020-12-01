package verify;

public class ComputerMainExample {

	public static void main(String[] args) {
		 Computer myCom=new Computer();
		 int[] values = {1,2,3};
		 
		 System.out.println(myCom.sum1(values));
		 
     
	//메소드로 넘어오는 매개값이 가변적일 때
		System.out.println(myCom.sum2(1,2,3));
		
		System.out.println(myCom.sum2(1));
		
		System.out.println(myCom.sum2(1,2,3,4,5,6));
		  // sum2에서(new int[]{1,2,3,4,5,6})
	}
}
