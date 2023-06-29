package beffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2 {
	public static void main(String[] args) {
		
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			String str="";
			System.out.println("Enter 'Quit' for quit");
			int maxline=0;
			String max="";
			
			
			while(!(str=br.readLine()).equalsIgnoreCase("Quit"))
			{
				if(maxline<str.length())
				{
					maxline=str.length();
					max=str;
					
				}
			}
			System.out.println("MAxlength= "+maxline);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
