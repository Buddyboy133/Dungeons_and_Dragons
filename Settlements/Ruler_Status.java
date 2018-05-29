package Settlements;

public class Ruler_Status {
	public static String ruler_status()
	{
		int x = Roll.roll(20,1);
		String y = "Ruler's Status: ";
		if(x <= 5)
			y += "Respected, fair, and just ";
		else if(x < 8)
			y += "Feared tyrant ";
		else if(x == 9)
			y += "Weakling manipulated by others ";
		else if(x == 10)
			y += "Illegitimate ruler, simmering civil war ";
		else if(x == 11)
			y += "Ruled or controlled by a powerful monster";
		else if(x == 12)
			y += "Mysterious, anonymous cabal ";
		else if(x == 13)
			y += "Contested leadership, open fighting";
		else if(x == 14)
			y += "Cabal seized power openly ";
		else if(x == 15)
			y += "Doltish lout ";
		else if(x == 16)
			y += "On deathbed, claimants compete for power";
		else if(x <= 18)
			y += "Iron-willed but respected ";
		else 
			y += "Religious leader";	
		return y;
	}

}
