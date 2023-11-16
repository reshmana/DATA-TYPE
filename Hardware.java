class Hardware{

         String name;
		 String Type;
		 Brand brand;
		 
		 
		 Hardware(){
		 System.out.println("created hardware using no arg constructor..");
		 
		 }

       void setType(String Type){
		   this.Type=Type;
		   
	   }
	   
	   void setname(String name){
		   
		   this.name=name;
	   }
	   
	   void setbrand(Brand brand){
		   this.brand=brand;
	   }
	   
	   void show(){
		   
		   System.out.println("Starting main in show");
		   System.out.println("name of hardware:"+this.name);
		   System.out.println("type of hardware:"+this.Type);
		   System.out.println("brand of hardware:"+this.brand);
		     if(brand!=null){
				 brand.show();
			 }
			 
		   System.out.println("Ending main in show");
			 
	   }
}



