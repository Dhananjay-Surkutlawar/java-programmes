public class Per
{
	 String email;
	 Address a1;
	
	Per()
	{


	}
	
	Per(String email,Address a1 )
	{
		//this.email= new String(email);
		this.email=email;
		this.a1=a1;

	}
	
	void show()
	{
		System.out.println("email:"+email);
		a1.show1();
	}
	
	
}