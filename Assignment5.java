package beffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class Assignment5 
{
	public static void main(String[] args) 
	{
		BufferedReader br=null;
		Writer w=null;
		Reader r=null;
		
		try 
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			r= new FileReader("E:/myfolder/nikhil.txt");
			System.out.println("Enter the file name");
	
		}
		catch(Exception e)
		{
			
		}

	}
}
