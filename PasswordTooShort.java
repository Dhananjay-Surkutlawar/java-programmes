package ExpHand;

public class PasswordTooShort extends Exception {

	String message;
	public PasswordTooShort() {
		// TODO Auto-generated constructor stub
		message="Your message is too short";
		
	}
	public String getMessage()
	{
		return message;
	}
	
}
