    class Person
{
	String name;
	String[] email;
	
	Person(String[] email)
	{
		
		this.email=email;
	
    }	
	void showInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Email :"+this.email);
		if(this.email!=null)
		{
			
			for(int i=0;i<this.email.length;i++)
			{
			    
				System.out.println("Email  :"+this.email[i] );
				
				
			}
		}
		System.out.println("Starting info in Person");
	}
}
	
	
	
	