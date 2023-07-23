class Boxarray
{
	private int height;
	private int len;
	private int breadth;
	
	
	
	Boxarray(int heigth,int len,int breadth)
	{
		this.height=height;
		this.len=len;
		this.breadth=breadth;
		
		
	}
	
	void show()
	{
		System.out.println("Volume of a box is: "+len*height*breadth);

	}
	
}