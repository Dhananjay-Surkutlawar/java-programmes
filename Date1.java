class Date1
{
	public static void main(String[] args)
	{
		Object a1 = new Object(20,12,2000);
		a1.show();
            Object a2 = new Object(a1);
		a2.show();

	
	}

}
class Object

{
	private int dd;
	private int mm;
	private int yy;
	Object()
	{
		dd=0;
		mm=0;
		yy=0;

	}
		
	Object(int dd ,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	Object(Object d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
		
	}
	
	public void show()
	{
		System.out.println(dd+"/"+mm+"/"+yy);

	}
		
}

