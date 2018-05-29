package Settlements;


public class Random_Building {
	
	public static void main(String[] args) 
	{
		System.out.println(building());
	}
	public static String building()
	{
		int x = Roll.roll(20,1);
		String y = "";
		if(x <= 10)
			y += Residence.residence();
		else if(x <= 12)
			y += Religious_Building.religious_building();
		else if(x <= 15)
			y += Tavern.tavern();
		else if(x <= 17)
			y += Warehouse.warehouse();
		else 
			y += Shop.shop();
		
		return y;
	}

}
