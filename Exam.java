package ExpHand;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="saurabh";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					System.out.println(str.charAt(i));
			}
		}

	}

}
