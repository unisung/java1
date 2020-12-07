package verify;

public class Exercise05_02 {
	public static void main(String[] args) {
	 Anonymous anony=new Anonymous();
	 anony.field.run();
	 anony.method1();
	 anony.method2(new Vehicle() {
		@Override
		public void run() {
			System.out.println("트럭이 달립니다");
		}
	  });
	}//main 끝.
}

interface Vehicle{
	void run();
}

class Anonymous{
	Vehicle field=new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar=new Vehicle() {
			@Override
			public void run() {
		   System.out.println("승용차가 달립니다.");
			}
		};
		 
	  localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
