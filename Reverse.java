class Reverse
{
	public static void main(String[] args)	
	{
		int a=4568;
		int b;

		while(a>0)
		{
			b=a%10;
			System.out.print(b);
			a=a/10;
			
		}
	}	
}