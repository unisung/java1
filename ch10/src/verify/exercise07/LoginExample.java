package verify.exercise07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}//main 끝.
	
	public static void login(String id,String password) 
			 throws Exception {
	  if(!id.equals("blue")) {
		  throw new NotExistIdException("아이디가 존재하지않습니다.");
	  }
		
	  if(!password.equals("12345")) {
		  throw new WrongPasswordException("패스워드가 틀립니다");
	  }
	}

}
