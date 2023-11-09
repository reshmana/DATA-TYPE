class Canteen
{
	String type;
	String[] utensils;//40
	
	void setType(String type)
	{
		this.type=type;
	}
	void setUtensils(String[] utensils)
	{
		this.utensils=utensils;
	}
	
	void showInfo()
	{
		System.out.println("Type :"+this.type);
		System.out.println("Utensils :"+this.utensils);
		if(this.utensils!=null)
		{
			for(int seq=0;seq<this.utensils.length;seq++)
			{
				String ref=this.utensils[seq];
				System.out.println("Utensils :"+ref+"__Index :"+seq);
			}
		}
		
	}
	
}