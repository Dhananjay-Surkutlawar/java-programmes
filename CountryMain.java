package ExpHand;

import java.util.Scanner;

public class CountryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the name");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	System.out.println("Enter the username");
	String username=sc.nextLine();
	System.out.println("Enter the country name");
	String country=sc.nextLine();
	String ind="India";
	
	try
	{
		if(country.equalsIgnoreCase(ind))
		{ 
		System.out.println("Name:"+name);
		System.out.println("User name:"+username);
		System.out.println("Country"+country);
		System.out.println("*******user succesfully registred*******");
		}
		else 
			throw new InvalidCountryException();
	}
	catch (InvalidCountryException e )
		{
		System.out.println(e.getMessage());
		}
				
	
	
	}

}
