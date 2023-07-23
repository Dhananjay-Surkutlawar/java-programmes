class Boxmain
{
	public static void main(String [] args)
	{
		Boxarray []arr= new Boxarray[3]; 
		arr[0]= new Boxarray(23,65,89);
		arr[1]= new Boxarray(65,32,12);
		arr[2]= new Boxarray(65,98,45);
		
		for(int i=0;i<arr.length;i++)
		{

			arr[i].show();


	
		}
	}


}