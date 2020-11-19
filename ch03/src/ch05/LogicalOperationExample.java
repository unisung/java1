package ch05;

public class LogicalOperationExample {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		//왼쪽 false , 오른쪽 연산 중 10/0으로 오류 발생
		if((i != 1) && (10/(--j)!=1) ) {
			System.out.println("false");
		}else
		System.out.println("true");
		
		//왼쪽 true, 오른쪽 연산중 10/0으로 오류 발생
		if(i==1 || (10/(--j)!=1)) {
			System.out.println("여기");
		}else
			System.out.println("저기");
		System.out.println("-------------");
		
		if((i!=1) & --j==0) {
			System.out.println(j);
		}
		System.out.println(j);
		
		if((i!=1) && --j==-1) {
			System.out.println(j);
		}
		System.out.println(j);

	}

}
