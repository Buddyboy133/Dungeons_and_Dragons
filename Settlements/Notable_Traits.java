package Settlements;

public class Notable_Traits {

	public static String traits()
	{
		int x = Roll.roll(20,1);
		int z = Roll.roll(100, 1);
		String y = "Notable Traits: ";
		if(x == 1)
			y += "Canals in place of streets ";
		else if(x == 2)
			y += "Massive statue or monument";
		else if(x == 3)
			y += "Grand temple";
		else if(x == 4)
			y += "Large fortress ";
		else if(x == 5)
			y += "Verdant parks and orchards";
		else if(x == 6)
			y += "River divides town ";
		else if(x == 7)
			y += "Major trade center";
		else if(x == 8)
		{
			if(z <= 50)
				y += "Headquarters of a powerful family";
			else
				y += "Headquarters of a powerful guild";
		}
		else if(x == 9)
			y += "Population mostly wealthy ";
		else if(x == 10)
			y += "Destitute, rundown";
		else if(x == 11)
			y += "Awful smell (tanneries, open sewers) ";
		else if(x == 12)
			y += "Center of trade for one specific good ";
		else if(x == 13)
			y += "Site of many battles";
		else if(x == 14)
			y += "Site of a mythic or magical event";
		else if(x == 15)
			y += "Important library or archive ";
		else if(x == 16)
			y += "Worship of all gods banned ";
		else if(x == 17)
			y += "Sinister reputation ";
		else if(x == 18)
		{
			if(z<= 50)
				y += "Notable library";
			else
				y += "Notable academy";
		}
		else if(x == 19)
			y += "Site of important tomb or graveyard";
		else 
			y += "Built atop ancient ruins";	
		return y;
	}
}
