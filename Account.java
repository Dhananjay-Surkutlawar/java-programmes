package bank;

public abstract class Account 
{
	private String accno;
	private String name;
	protected double balance;
	
	public Account()
	{
		
	}
	
	
	public Account(String accno, String name, double balance)
	{
		
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public  abstract void withdrawl(double amt);
	
	

	

	@Override
	public String toString() {
	return "Account no:" + accno + "\n Name:" + name + "\n Balance:" + balance ;
	}
	
	
	
	
}
