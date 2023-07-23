class Student
{
	private int id;
	private float percentage;
	
	Stundent()
	{
		id=0;
		percentage=0f;
	
	}
	
	Student(int a, float b)
	{	
		id=a;
		percentage= b 
	}
	
	show()
	{
		if(percentage>=90)
		System.out,println("Excellent");
		else
		if(percentage>80 && percentage<90)
		System.out,println("Very Good");
		else 
		if(percentage>70 && percentage<80)
		System.out,println("Good");
		else
		if(percentage>60 && percentage<70)
		System.out,println("Average");
		else
		if(percentage>40 && percentage<60)
		System.out,println("Pass");
		else
		System.out.println("fail");
	
	}
	
}