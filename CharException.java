package ExpHand;

public class CharException extends Exception {
	String messeage;
	CharException()
	{
		messeage="Letter are not in valid conditon";
	}
	public String getMessage()
	{
		return messeage;
	}

}
