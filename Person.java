class Person
{
	String name;
	Email[] email;
	
	Person(String name, Email[] email)
	{
		this.name=name;
		this.email=email;
	
    }	
	void showInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Email :"+this.email);
		if(this.email!=null)
		{
			System.out.println("Email length:"+this.email.length);
			for(int i=0;i<this.email.length;i++)
			{
			    Email emailArray=this.email[i];
				System.out.println("Email  :"+emailArray );
				emailArray.showInfo();
				
			}
		}
		System.out.println("Starting info in Person");
	}
}
	
	
	
	