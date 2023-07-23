class DateA3
{
	private int dd;
	private int mm;
	private int yy;
	static int count;
	
	DateA3()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	
	DateA3(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	
	static
	{
		count=0;
	}
	
	public void show()
	{	
		count++;
		System.out.println(dd+"/"+mm+"/"+yy);
		System.out.println("count is"+count);
		

	}
}

	