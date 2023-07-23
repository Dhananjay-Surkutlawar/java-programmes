class Book
{
	static int id;
	private float price;

	Book()
	{
		price=0;
		

	
	}
	
	Book(float price)
	{
		this.price=price;
		
	
	}
	
	static

	{
		id=0;
		
	}
	
	public void show()

	{
		id++;
		System.out.println("Book Id is "+id);
		System.out.println("Book price is"+price);
		
	}

	
}