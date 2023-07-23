class Fact{
       public static void main(String[] agrs)
	{
		int num=5;
		int i=1;
		int fact=1;
		while(i<=num)
		{
			fact=fact*i;
			++i;
		}
		System.out.println(fact);
	}
}