public class Address
{
	 String city;
	 String address;
	 int pincode;

	Address( )
	{
		
		
	}
	
	Address(String city,String address, int pincode )
	{
		this.city= city;
		this.address=address;
		this.pincode=pincode;
		
	}
		
	void show1()
	{
		System.out.println("city:"+city);
		System.out.println("address :"+address);
		System.out.println("pincode:"+pincode);
	}	
}