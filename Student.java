package beffer;

public class Student {

		int rollno;
		String name;
		float marks;
		
		public Student(int rollno, String name, float marks) {


			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}
		
		public void getgrade()
		{
			if(marks>90)
				System.out.println("Grade A");
			else if(marks<90&&marks>75)
			{
				System.out.println("Grade B");
			}
			else if(marks<75&&marks>60)
			{
				System.out.println("Grade C");
			}
			else if(marks<60&&marks>35)
			{
				System.out.println("Grade D");
			}
			else if(marks<35)
			{
				System.out.println("Fail");
			}
		}

		@Override
		public String toString() {
			return "Student \nrollno=" + rollno + "\nname=" + name + "\nmarks=" + marks;
		}
		
		
}
