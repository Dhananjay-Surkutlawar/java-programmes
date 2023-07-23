class A2q3
{	
	private int  length;
	private int breadth;
	private int height;
	
	A2q3()
	{
		length=5;
		breadth=5;
		height=5;
		
	}
	A2q3(int a,int b ,int c)
	{
		length=a;
		breadth=b;
		height=c;
		
		
	}
	
	public void showvolume()
	{
		
		System.out.println(length*breadth*height);
	}
		
}