class Adress{
       String street;
	   String pincode; 
	  String city;


     Adress(){
		 
		 System.out.println("ctrated adress using no arg constructor");
	 }
	 
	 void setstreet(String street){
		 this.street=street;
	 }
	 void setpincode(String pincode){
		 this.pincode=pincode;
	 }
	 
	 void setcity(String city){
		 this.city=city;
	 }
	 
	 void show(){
		 
		 System.out.println("Starting main in show");
		 
		 System.out.println("Street of adress is:"+street);
		 System.out.println("pincode of adress is:"+pincode);
		 System.out.println("city of adress is:"+city);
		 if (city!=null){
			 
			 city.show;
		 }
		 
		 System.out.println("Starting main in show");
		 
		 
	 }
}