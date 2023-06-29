package ExpHand;

public class InvalidCountryException extends Exception {
	String message;
	public InvalidCountryException()
	{
		message="Country name is invalid";
	}
	public String getMessage()
	{
		return message;
	}
	

}
