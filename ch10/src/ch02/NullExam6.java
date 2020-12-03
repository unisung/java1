package ch02;

public class NullExam6 {
	public static void main(String[] args) {
		String data=null;
		try {
			
		  System.out.println(data.length());
		  
		  System.out.println(args[1]);
		  
		  Animal animal = new Dog();
		  Cat cat=(Cat)animal;
		  
		 //다중 catch절 1.7 이후 가능	
		}catch(NullPointerException | ArrayIndexOutOfBoundsException 
				   | ClassCastException  e) {
			System.out.println("예외발생");
		//상위 예외일수록 아래로, 하위 예외객체일수록 위로 배치
		}catch(Exception e4) {
		   System.out.println("예외발생");	
		}
		
	}
}