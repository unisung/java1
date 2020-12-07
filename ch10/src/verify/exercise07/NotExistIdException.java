package verify.exercise07;

public class NotExistIdException extends Exception{
	public NotExistIdException() {super();}
	public NotExistIdException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {super();	}
	public WrongPasswordException(String message) {
		super(message);
	}
}