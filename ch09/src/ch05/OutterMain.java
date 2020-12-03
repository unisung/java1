package ch05;

public class OutterMain {
  public static void main(String[] args) {
	//¹Ù±ù°´Ã¼ »ı¼º
	Outter out=new Outter();
	//¹Ù±ù ÂüÁ¶º¯¼ö.new ¾ÈÂÊ°´Ã¼();
	Outter.Nested nested
		 =out.new Nested();
		
	nested.print();
		
		
	}

}
