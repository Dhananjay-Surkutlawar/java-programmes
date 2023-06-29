package bank;

public class Saving extends Account
{
	static float intrest;
	
	
	
	public Saving() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Saving(String accno, String name, double balance) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
	}


	static 
	{
		intrest=4.5f;
		
	}
	public  void withdrawl(double amt)
	{
		
		if(balance<2000||balance-amt<2000)
			System.out.println("Your balance is low \n Not able to withdraw");
		else
			balance=balance-amt;
		System.out.println("Withdrawl successfully \n Your balance is:"+balance);
	}

@Override
	public String toString() 
{
		return super.toString();
	}


	
	
	

}
