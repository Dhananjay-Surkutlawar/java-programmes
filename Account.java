class Account
{
	private long id;
	private double bal;
	static float int_rate;
	
	Account()
	{
		id=00;
		bal=0.00;
	
	}
	Account(long a,double b)
	{
		id=a;
		bal=b;
		
	}

	static 
	{
		int_rate=4.5f;
	
	}
	
	void show()
	{
		System.out.println("balance is "+int_rate*bal);
	}
		
}