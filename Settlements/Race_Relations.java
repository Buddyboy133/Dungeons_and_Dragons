package Settlements;

public class Race_Relations {

	public static String race_relations()
	{
		int x = Roll.roll(20,1);
		String y = "Race Relations: ";
		if(x <= 10)
			y += "Harmony";
		else if(x <= 12)
			y += "Tension";
		else if(x <= 14)
			y += "Rivalry";
		else if(x <= 16)
			y += "Racial majority are conquerors";
		else if(x == 17)
			y += "Racial minority are rulers ";
		else if(x == 18)
			y += "Racial minority are refugees ";
		else if(x == 19)
			y += "Racial majority oppresses minority ";
		else 
			y += "Racial minority oppresses majority";	
		return y;
	}
}
