class Array
{
	public static void main(String[] args)
	{
		int []arr={90,100,40,80,900};
		
		int low= arr[0];
		int high= arr[0];

			for(int i=0;i<arr.length;i++)
			{
		  		if(arr[i]<low)
				low=arr[i];
		
			}

			System.out.println("min value of array is "+low);

			for(int i=0;i<arr.length;i++)
			{
		  		if(arr[i]>high)
				high=arr[i];
		
			}
			System.out.println("max  value of array is "+high);
		
		
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("array element is "+arr[i]);
		
		
			}
	
			int sum=0;
			for (int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			
			System.out.println("sum of array is "+sum);

			int avg;
			avg=sum/arr.length;
			
			System.out.println("average of array is "+avg);

	}
}