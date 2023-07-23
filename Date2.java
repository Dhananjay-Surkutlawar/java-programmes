class Date2
{	
	private int dd;
	private int mm;
	private int yy;
	private char ch;
	
	Date2()
	{
		dd=8;
		mm=5;
		yy=1999;
		
	}
	
	Date2(char ch)
	{
		this.ch=ch;
		
	}
	
	
	public void showdate()
	{
		System.out.println(dd+""+ch+mm+""+ch+yy);
		
	}
}