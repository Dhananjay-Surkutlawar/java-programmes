class Array2d
{
	public static void main(String[] args)
	{ 
		int [][]arr={{2,3,4},{5,6,7},{9,2,3}};
		int []arr1 = new int[3];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[i][j];
			
			}
			arr1[i]=sum;
		}
	
		for(int i=0;i<arr1.length;i++)
		{	
			System.out.println(arr1[i]);
		}
		
	}
}