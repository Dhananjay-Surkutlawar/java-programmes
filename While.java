import java.util.Scanner;

public class While {
public static void main( String []args)
{
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number ");
    int num = sc.nextInt();
    int prime=num;
    int count = 0 ;
 
    for(int i=2;i<=num;i++)
    {
        if(num%i == 0 )
        count++;
    }
 

System.out.println(count==1?"it is a prime no." : "it is not a prime no.");

}

}