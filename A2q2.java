class A2q2
{
	private int dd;
	private int mm;
	private int yy;
 	
	A2q2()
	{
		dd=8;
		mm=4;
		yy=1999;
	}


	A2q2(int a,int b,int c)
	{
		dd=a;
		mm=b;
		yy=c;
	}


	public void showdate()
	{
		System.out.println(dd+"/"+ mm+"/"+yy);
		
	}
}