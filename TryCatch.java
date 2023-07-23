class TryCatch
{
	public static void main(String[] args) 
	{
		m1();

	}

	public static String m1()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException occur");
			// System.exit(0);
			return null;
		}

		finally
		{
			System.out.println("hi");
		}
	}
}