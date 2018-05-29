package Settlements;

public class Known_For {
	public static String known()
	{
		int x = Roll.roll(20,1);
		String y = "Known for its ";
		if(x == 1)
			y += "Delicious cuisine";
		else if(x == 2)
			y += "Rude people ";
		else if(x == 3)
			y += "Greedy merchants ";
		else if(x == 4)
			y += "Artists and writers";
		else if(x == 5)
			y += "Great hero/savior";
		else if(x == 6)
			y += "Flowers";
		else if(x == 7)
			y += "Hordes of beggars";
		else if(x == 8)
			y += "Tough warriors ";
		else if(x == 9)
			y += "Dark magic ";
		else if(x == 10)
			y += "Decadence";
		else if(x == 11)
			y += "Piety";
		else if(x == 12)
			y += "Gambling";
		else if(x == 13)
			y += "Godlessness";
		else if(x == 14)
			y += "Education";
		else if(x == 15)
			y += "Wines";
		else if(x == 16)
			y += "High fashion";
		else if(x == 17)
			y += "Political intrigue";
		else if(x == 18)
			y += "Powerful guilds";
		else if(x == 19)
			y += "Strong drink";
		else 
			y += "Patriotism";	
		return y;
	}

}
