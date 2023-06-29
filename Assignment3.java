package beffer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3 {
	public static void main(String[] args) {
		BufferedReader br=null;
		try
		{
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the roll no");
			int roll=Integer.parseInt(br.readLine());
			System.out.println("Enter the name");
			String name=br.readLine();
			System.out.println("Enter the marks");
			float marks=Float.parseFloat(br.readLine());
			
			Student s= new Student(roll,name,marks);
			System.out.println(s);
		}
		
		catch(IOException e)
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
