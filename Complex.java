class Complex
{
	private int real;
	private int imag;
	
	Complex()
	{
		real=0;
		imag=0;
	
	}	
	
	Complex(int a,int b)
	{
		real=a;
		imag=b;
	
	}
	
	public void show()
	{
		if(imag<0)
		System.out.println("imaginary value is negative");
		else
		System.out.println(real+"+"+imag+"i");
			
	}
}