class Restaurant
{
	String ownerName="Reshma";
	String[] specialItems;//5
	
	Restaurant()
	{
		System.out.println("Starting default const in Restaurant");
		
	}
	
	void setSpecialItems(String[] specialItems)
	{
		this.specialItems=specialItems;
	}
	
	void displayInfo()
	{
		System.out.println("Starting displayInfo in Restaurant");
		System.out.println("Owner Name :"+this.ownerName);
		System.out.println("SpecialItems :"+this.specialItems);
		if(this.specialItems!=null)
		{
			System.out.println("Email length :"+this.specialItems.length);
			for(int i=0;i<this.specialItems.length;i++)
			{
				String specialArray=this.specialItems[i];
				System.out.println("Special items :"+specialArray+"index :"+i);
			}
		}
	}
}