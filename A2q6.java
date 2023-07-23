class A2q6
{
	private int a;
	private int b;
	
	A2q6()
	{
		a=0;
		b=0;

	}
	A2q6(int x,int y)
	{	
		a=x;
		b=y;
	
	}
	
	public void add()
	{
		System.out.println("Addition is "+(a+b));

	}
	
	public void sub()
	{
		System.out.println("Difference is"+(a-b));
	}
	
	public void mul()
	{
		System.out.println("product is "+(a*b));

	}
	
	public void div()
	{
		if(a>b)
		System.out.println("division is "+(b/a));
		else
		System.out.println("division is "+(a/b));
		
		
	}

}
