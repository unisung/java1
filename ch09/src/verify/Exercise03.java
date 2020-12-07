package verify;

public class Exercise03 {
	MyInterface mi=new MyInterface() {
		@Override
		public void m() {	}
		};//필드의 초기값
	
   public static void main(String[] args) {
	 MyInterface mi=
	    new MyInterface() {
		   public static final int field=0;//
			@Override
			public void m() {}
		// public MyInterface() {}
	};
	//int result=mi.field;
	
}
}

interface MyInterface{void m();}