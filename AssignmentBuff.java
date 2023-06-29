package beffer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignmentBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
				br=new BufferedReader(new InputStreamReader(System.in));
				int n;
				System.err.println("Enter 'q' for quit ");
				while((n =br.read())!='q')
				{
					System.out.println((char)n);
				}
		
			}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		finally
		{
			
			try {
				br.close();
				} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
