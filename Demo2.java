package ExpHand;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
			
			int d =Integer.parseInt(args[0]);
			int []arr=new int [d];
			for(int i=0;i<args.length;i++)
			{
				arr[i]=Integer.parseInt(args[i+1]);
			}
			
			for(int i=0; i<arr.length ;i++)
			{
				System.out.println(arr[i]);
			}
			
		try
		{
		System.out.println("Enter the array index number");
		int a=sc.nextInt();
		System.out.println(arr[a]);
		}
       catch(ArrayIndexOutOfBoundsException e)
		{
    	   System.out.println("From catch block 1");
    	   e.printStackTrace();//inbuilt  
		}
		catch(NumberFormatException e)
		{
    	   System.out.println("From catch block 2");
    	   e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
    	   System.out.println("From catch block 3");
    	   e.printStackTrace();
		}
		catch(Exception e)
		{
    	   System.out.println("From catch block 4");
    	   e.printStackTrace();
		}
		finally
		{
			System.out.println("from finally block");
		}
	}

}
