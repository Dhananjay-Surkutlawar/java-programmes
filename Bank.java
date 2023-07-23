class Bank
{
	private long  accountnum;
	private double balance;
	
	Bank()
	{
		accountnum=0;
		balance=0.0;
	

	}
	Bank(long id,double bal)
	{
		accountnum=id;
		balance=bal;
	}
	
	void showinfo()
	{
		System.out.println("Account number is"+accountnum);
		System.out.println("Balance  is"+balance);
	}
	
		
}