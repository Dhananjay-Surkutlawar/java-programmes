class Prime1
{
 	public static void main(String [] args)
	{
		int a = 11;
		int count = 0;

		for(int i = 2; i<=a ; i++)
		{
			if(a%i==0)
			count++;
		}

		System.out.println(count==1?"Prime":"Not a prime");
	}

}