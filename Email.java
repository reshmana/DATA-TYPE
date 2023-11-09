class Email{

      Domain domain;
	  String id;
      String  fname;
	  String lastname;
	  
	  
	  Email() {
	     System.out.println("created Email with no arg ..");
	  }
	   
       void setEmail(Domain domain, String id,String fname,String lastname){
	   
	          this.domain=domain;
			  this.id=id;
			  this.fname=fname;
			  this.lastname=lastname;
	   }
	   void showInfo()
	   {
		   System.out.println("Starting main in showInfo");

		   System.out.println("emai id is:"+this.id);
		   System.out.println("emai fname is:"+this.fname);
		   System.out.println("emai lastname is:"+this.lastname);
		   System.out.println("emai domain is:"+this.domain);

         if (domain!=null){
		System.out.println("emai domain is:"+this.domain.EMAIL);
        System.out.println("emai domain is:"+this.domain.OUTLOOK);

		 }
          System.out.println("Ending main in showInfo");
	   }
}