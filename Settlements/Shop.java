package Settlements;

public class Shop {
	public static String shop()
	{
		int x = Roll.roll(20,1);
		String y = "Shop: ";
		if(x == 1)
			y += "Pawnshop";
		else if(x == 2)
			y += "Herbs/incense ";
		else if(x == 3)
			y += "Fruits/vegetables";
		else if(x == 4)
			y += "Dried meats";
		else if(x == 5)
			y += "Pottery";
		else if(x == 6)
			y += "Undertaker";
		else if(x == 7)
			y += "Books";
		else if(x == 8)
			y += "Moneylender";
		else if(x == 9)
			y += "Weapons/armor";
		else if(x == 10)
			y += "Chandler";
		else if(x == 11)
			y += "Smithy";
		else if(x == 12)
			y += "Carpenter";
		else if(x == 13)
			y += "Weaver";
		else if(x == 14)
			y += "Jeweler";
		else if(x == 15)
			y += "Baker";
		else if(x == 16)
			y += "Mapmaker";
		else if(x == 17)
			y += "Tailor";
		else if(x == 18)
			y += "Ropemaker";
		else if(x == 19)
			y += "Mason";
		else 
			y += "Scribe";	
		return y;
	}

}
