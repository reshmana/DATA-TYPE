class RestaurantUnique
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RestaurantUnique");
		Restaurant restaurant=new Restaurant();
		String[] items=new String[5];
		items[0]="Jeelebi";
		items[1]="Jahangeer";
		items[2]="Jamun";
		items[3]="Peda";
		items[4]="Paysa";
		restaurant.setSpecialItems(items);
		restaurant.displayInfo();
		System.out.println("Ending main in RestaurantUnique");
	}
}