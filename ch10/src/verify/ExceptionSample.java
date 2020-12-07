package verify;

public class ExceptionSample {
   void m1() {
	   try {
		    
	   }catch(Exception e) {}
   }
  
   void m2() throws ArithmeticException,IndexOutOfBoundsException{
	   if(true) {
	     throw new ArithmeticException();
	   }else {
	     throw new IndexOutOfBoundsException();
	   }
   }
	
	
	
	public static void main(String[] args) {
	}

}
