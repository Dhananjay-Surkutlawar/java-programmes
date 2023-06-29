package ExpHand;

public class PasswordTooLongException extends Exception {
	String message;
	public PasswordTooLongException() {
		// TODO Auto-generated constructor stub
		message="Your password is too long ";
		
	}
	
	public String getMessage()
	{
		return message;
	}

}
