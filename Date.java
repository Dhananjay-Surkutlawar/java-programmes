package office.utility;
public class Date
{
	 int dd;
	 int mm;
	 int yy;
	
	 public Date(int dd, int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	 public void show()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	
	}
}