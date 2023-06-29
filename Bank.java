package bank;

import java.util.Scanner;

public class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	/*	
		Saving s1;// object
		System.out.println("Enter the account no:");
		String acc= sc.nextLine();
		System.out.println("Enter the name:");
		String name= sc.nextLine();
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		s1=new  Saving(acc,name,balance);
		System.out.println(s1);
		s1.withdrawl(2000);
		*/
		
		
		
		 Account a = new Saving("354651321","lsls",545313);
		 System.out.println(a);
		 Saving b= (Saving)a;
		 System.out.println(b);
		
		
	}

}
