package beffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer w=null;
		Reader r=null;
		BufferedReader br= null;
		
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in)); // input 
			System.out.println("Enter the file name: ");  
			String fname=br.readLine(); // fnname = file name 
			w =new FileWriter("E:\\myfolder\\"+fname);
			System.out.println("Write in file");
			w.write(br.readLine()); // write in that above folder 
			w.close(); // close  writing 
			r= new FileReader("E:/myfolder/"+fname); // read the file content 
			int n;
			while((n=r.read())!=-1)
			{
				System.out.println((char)n); // data print 
			}
			
			
		}
		catch (IOException e)
		{
			System.out.println("IOException occurs");
		}
		finally
		{
			try {
				br.close();
				w.close();
				r.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

	

}
