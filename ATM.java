class ATM
{
	String bankName="Canara Bnak";
	String[] branch;//5
	String[] acs;//3
	String[] cctvBrands;//5
	
	ATM(String[] branch,String[] acs,String[] cctvBrands)
	{
		this.branch=branch;
		this.acs=acs;
		this.cctvBrands=cctvBrands;
	}
	
	void showInfo()
	{
		System.out.println("Bank Name :"+this.bankName);
		System.out.println("Branch :"+this.branch);
		if(this.branch!=null)
		{
			for(int i=0;i<this.branch.length;i++)
			{
				String ref=this.branch[i];
				System.out.println("Branch :"+ref+"__Index :"+i);
			}
		}
		System.out.println("ACS :"+this.acs);
		if(this.acs!=null)
		{
			for(int seq=0;seq<this.acs.length;seq++)
			{
				String ref1=this.acs[seq];
				System.out.println("ACS :"+ref1+"__Index :"+seq);
			}
		}
		System.out.println("CCTV Brands :"+this.cctvBrands);
		if(this.cctvBrands!=null)
		{
			for(int j=0;j<this.cctvBrands.length;j++)
			{
				String ref2=this.cctvBrands[j];
				System.out.println("cctvBrands :"+ref2+"__Index :"+j);
			}
		}
		
	}
}