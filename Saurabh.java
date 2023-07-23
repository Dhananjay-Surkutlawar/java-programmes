class Student
{
	private String name;
	private int roll_no;

	Student(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;

	}

	public static void main(String[] args) {
		Student s=new Student("dhananjay",42);
		System.out.println(s);
	}
}