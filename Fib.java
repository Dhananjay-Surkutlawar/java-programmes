class Star{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j<=1;j--)
			{
				System.out.print(" ");
				for(int k=i;k<=i;k++)
				{
					System.out.print("*");
				}
			} System.out.println(" ");
		}
	}
}