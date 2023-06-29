package ExpHand;

import java.util.Scanner;

public class Passwordmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String str=sc.next();
		try
		{
			if(str.length()<8)
			{
				throw new PasswordTooShort();
			}
			
			
			else if(str.length()>12)
			{
				throw new PasswordTooLongException();
			}
			
			else
				System.out.println("your password is valid ");
			
		}
				catch (PasswordTooLongException e)
				{
					System.out.println(e.getMessage());
			
				}
				catch (PasswordTooShort e)
				{
					System.out.println(e.getMessage());
				}
		
				catch (Exception e)
				{
					System.out.println("Default exception");
				}
		
			
		
	}

}
