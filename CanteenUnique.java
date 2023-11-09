class CanteenUnique
{
	public static void main(String[] args)
	{
		Canteen canteen=new Canteen();
		
		String[] utensils=new String[40];
		
		utensils[0]="Wooden Spoon";
		utensils[1]="Thermos";
		utensils[2]="Potato Masher";
		utensils[3]="Napkin";
		utensils[4]="Toaster";
		utensils[5]="Rolling Pin";
		utensils[6]="Oven Gloves";
		utensils[7]="Scissors";
		utensils[8]="Cleaver";
		utensils[9]="Cup";
		utensils[10]="Whisk";
		utensils[11]="Spatula";
		utensils[12]="Perforated Spoon";
		utensils[13]="Measuring Cup";
		utensils[14]="Corkscrew";
		utensils[15]="Butter Knife";
		utensils[16]="Tongs";
		utensils[17]="Sieve";
		utensils[18]="Peppermill";
		utensils[19]="Ladle";
		utensils[20]="Colander";
		utensils[21]="Bottle Opener";
		utensils[22]="Wok";
		utensils[23]="Steak Hammer";
		utensils[24]="Pizza Cutter";
		utensils[25]="Mortar";
		utensils[26]="Deep Fryer";
		utensils[27]="Cake Slicer";
		utensils[28]="Hot Pot";
		utensils[29]="Peeler";
		utensils[30]="Mixer";
		utensils[31]="Jug";
		utensils[32]="Grater";
		utensils[33]="Gas Stove";
		utensils[34]="Refrigerator";
		utensils[35]="Serving Bowl";
		utensils[36]="Kettle";
		utensils[37]="Cutting Board";
		utensils[38]="Egg Slicer";
		utensils[39]="Spice Box";
			
		canteen.setType("Veg");
        canteen.setUtensils(utensils);
		canteen.showInfo();
	}
}