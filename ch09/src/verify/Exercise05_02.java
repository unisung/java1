package verify;

public class Exercise05_02 {
	public static void main(String[] args) {
	 Anonymous anony=new Anonymous();
	 anony.field.run();
	 anony.method1();
	 anony.method2(new Vehicle() {
		@Override
		public void run() {
			System.out.println("Ʈ���� �޸��ϴ�");
		}
	  });
	}//main ��.
}

interface Vehicle{
	void run();
}

class Anonymous{
	Vehicle field=new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	void method1() {
		Vehicle localVar=new Vehicle() {
			@Override
			public void run() {
		   System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		 
	  localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
