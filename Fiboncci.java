import java.util.Scanner;

public class Fiboncci 
{
    public static void main(String[] args)
    {
        int num=0;
        int num1=1;
        System.out.println(num + " "+num1+" ");
        System.out.println("ENTER THE ITERATION");
        Scanner sc = new Scanner(System.in);
        int itr = sc.nextInt();


        for(int i=1;i<=itr;i++)
        {
            int num2=num+num1;
            num=num1;
            num1=num2;
            System.out.print(num2+" ");
        

        }
                
    }

}