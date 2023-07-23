class Prime{
	public static void main(String[] args)
	{
		int n=23;
		boolean f=false;
		for(int i=2;i<n;i++)
		{
		if (n%i==0)
		  { 
			f=true;
		      break;
		  }
		
		}
		//if(f==true)
		//System.out.println("not prime");
		//else 
		//System.out.println("it is prime");

		System.out.println(f==false?"Prime":"not a prime");
	}
		
}