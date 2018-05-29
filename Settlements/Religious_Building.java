package Settlements;

public class Religious_Building {
	public static String religious_building()
	{
		int x = Roll.roll(20,1);
		String y = "Religous Building: ";
		if(x <= 5)
			y += "Temple to a good deity";
		else if(x <= 10)
			y += "Temple to a neutral deity ";
		else if(x <= 12)
			y += "Temple to a false deity (run by charlatan priests)";
		else if(x == 13)
			y += "Home of ascetics ";
		else if(x <=15)
			y += "Abandoned shrine";
		else if(x <= 17)
			y += "Library dedicated to religious study";
		else 
			y += "Hidden shrine to a fiend or an evil deity";	
		return y;
	}

}
