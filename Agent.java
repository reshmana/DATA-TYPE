class Agent {

          int id;
		  String name;
		  Tent tent;
		  
		  
		  void openTent(Tent tent){
		  
		  tent.open();
		  
		  }
		  void closeTent(Tent tent){
		  
		  tent.close();
		  
		  }
		  void showInfo(){
		       
             System.out.println("id is :"+this.id);
             System.out.println("name is :"+this.name);			 
		  }



}