class Person
{
		private String name;
		private Date bdate;
		
		
		 Person(String name,int dd,int mm, int yy)
		{
			this.name=new String(name);
			this.name=name;
			this.bdate= new Date(dd,mm,yy);
		}
		
		void showdate1()
		{
			System.out.println("Name: "+name);
			System.out.println("Bdate: ");
			bdate.showdate();
		}
}