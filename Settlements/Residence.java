package Settlements;

public class Residence {
	public static String residence()
	{
		int x = Roll.roll(20,1);
		String y = "Residential Building: ";

		if(x <= 2)
			y += "Abandoned squat ";
		else if(x <= 8)
			y += "Middle-class home";
		else if(x <= 10)
			y += "Upper-class home ";
		else if(x <= 15)
			y += "Crowded tenement ";
		else if(x <= 17)
			y += "Orphanage ";
		else if(x == 18)
			y += "Hidden slavers' den ";
		else if(x == 19)
			y += "Front for a secret cult ";
		else 
			y += "Lavish, guarded mansion ";	
		return y;
	}

}
