package ExpHand;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			System.out.println("Division \n "+(n1/n2));
		}
		catch (NumberFormatException e)
		{
			System.out.println("in number format exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In array bound Exeption");
		}
		catch(Exception e)
		{
			System.out.println("in a default/ exception block");
		}
		finally
		{
			System.out.println("in a finally block ");
		}

	}

}
