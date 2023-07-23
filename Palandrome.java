import java.util.Scanner;

/**
 * Palandrome
 */
public class Palandrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;

        while(temp>0)
        {
            int rem= temp%10; //11  1 
            rev=rev*10+rem;// 
            temp = temp/10; //111/10   11 

        }
         
        
        System.out.println("Reverse value is "+rev);
        System.out.println(rev==num?"it is palandrome" : "not a palandrome");
         



    }
}