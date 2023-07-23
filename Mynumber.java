class Mynumber
{	private int a; // instance variablei
	
	Mynumber()
	{
		a=0;
	}
	Mynumber(int a)
	{
		this.a=a;

	}
	
	public boolean isOdd()
	{
		boolean flag=false;

		if(a%2==1)
		 flag=true;
		return flag;
	}

	public boolean isEven()
	{
		boolean flag=false;

		if(a%2==0)
		 flag=true;
		return flag;
	}
	public boolean isNegative()
	{
		boolean flag=false;
		if(a<0)
		 flag=true;
		return flag;

	}
	public void isPositive()
	{
		if(a>0)
		System.out.println("no is positive");
		else 
		System.out.println("no.is not positive");
	}
	public void isZero()
	{
		if(a==0)
		System.out.println("no is zero");
		else 
		System.out.println("no.is not zero");
	}


}
