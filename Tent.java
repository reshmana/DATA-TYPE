class Tent{
         int SlNo;
	     Colour colour;
	    double width;
	    double height;
	
	
	
	boolean open(){
		
		System.out.println("tent is opened");
		return true;
	}
	
	boolean close(){
		System.out.println("tent is closed");
		return false;
	}
	
	void showInfo(int SlNo,Colour colour,double width,double height){
		this.colour=colour;
		this.SlNo=SlNo;
		this.width=width;
		this.height=height;
		
		System.out.println("Starting showInfo in Tent");
		System.out.println("tent SlNo is "+SlNo);
		
		if(colour!=null){
		System.out.println("tent color is "+colour.RED);
		System.out.println("tent color is "+colour.BLUE);
		System.out.println("tent color is "+colour.PINK);
		}
		System.out.println("tent width is "+width);
		System.out.println("Ending showInfo in Tent");
	}
}