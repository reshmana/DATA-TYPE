class Brand{

       String name="Samsung";
	   String origin="South korean";
	  String  CeoName="Jong hee han";
	   City[] cities;
	   
     Brand(){
		 System.out.println("creating barnd using no arg...");
	 }
	  
	  void setcities(City[] cities){
		  this.cities=cities;
	  }
     
	 void show(){
		 System.out.println("Starting main in show");
		 System.out.println("name of brand:"+this.name);
		 System.out.println("origin of brand :"+this.origin);
		 System.out.println("ceo name of brand"+this.CeoName);
		 System.out.println("cities of brand:"+this.cities);
		  if (cities!=null){
		   for(int seq=0; seq<this.cities.length;seq++){
			   
			   City ref=this.cities[seq];
			   System.out.println("cities are"+this.cities[seq]+"at the seq"+ref);
			   ref.show();
		   }
			  
		  }
		 System.out.println("Ending main in show");
	 }
}