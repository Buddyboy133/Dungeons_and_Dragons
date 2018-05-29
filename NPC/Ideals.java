package NPC;

public class Ideals {

	public static String ideals(String alignment) {
		int x = Roll.roll(6, 1);
		String y = "";
		String LG = "Lawful Good";
		String NG = "Neutral Good";
		String CG = "Chaotic Good";
		String LN = "Lawful Neutral";
		String N = "Neutral";
		String CN = "Chaotic Neutral";
		String LE = "Lawful Evil";
		String NE = "Neutral Evil";
		String CE = "Chaotic Evil";
		if(alignment == LG)
		{
			if(x<= 2)
				y = Good();
			else if(x<= 4)
				y = Lawful();
			else if(x == 5)
				y = Neutral();
			else if(x == 6)
				y = Other();
		}
		else if(alignment == NG)
		{
			x = Roll.roll(7, 1);
			if(x<= 2)
				y = Good();
			else if(x <= 4)
				y = Neutral();
			else if(x == 5)
				y = Lawful();
			else if(x == 6)
				y = Chaotic();
			else if(x == 7)
				y = Other();
		}
		else if(alignment == CG)
		{
			if(x<= 2)
				y = Good();
			else if(x<= 4)
				y = Chaotic();
			else if(x == 5)
				y = Neutral();
			else if(x == 6)
				y = Other();
		}
		else if(alignment == LN)
		{
			x = Roll.roll(7, 1);
			if(x<= 2)
				y = Lawful();
			else if(x <= 4)
				y = Neutral();
			else if(x == 5)
				y = Good();
			else if(x == 6)
				y = Evil();
			else if(x == 7)
				y = Other();
		}
		else if(alignment == N)
		{
			if(x == 1)
				y = Good();
			else if(x == 2)
				y = Lawful();
			else if(x == 3)
				y = Chaotic();
			else if(x == 4)
				y = Evil();
			else if(x == 5)
				y = Neutral();
			else if(x == 6)
				y = Other();
		}
		else if(alignment == CN)
		{
			if(x<= 2)
				y = Chaotic();
			else if(x<= 4)
				y = Neutral();
			else if(x == 5)
				y = Good();
			else if(x == 6)
				y = Evil();
			else if(x == 7)
				y = Other();
		}
		else if(alignment == LE)
		{
			if(x<= 2)
				y = Evil();
			else if(x<= 4)
				y = Lawful();
			else if(x == 5)
				y = Neutral();
			else if(x == 6)
				y = Other();
		}
		else if(alignment == NE)
		{
			if(x<= 2)
				y = Evil();
			else if(x<= 4)
				y = Neutral();
			else if(x == 5)
				y = Lawful();
			else if(x == 6)
				y = Chaotic();
			else if(x == 7)
				y = Other();
		}
		else if(alignment == CE)
		{
			if(x<= 2)
				y = Evil();
			else if(x<= 4)
				y = Chaotic();
			else if(x == 5)
				y = Neutral();
			else if(x == 6)
				y = Other();
		}
		y =  "Ideals: "+y;
		return y;
	}
	public static String Good() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Beauty";
		else if(x == 2)
			y = "Charity";
		else if(x == 3)
			y = "Greater good";
		else if(x == 4)
			y = "Life";
		else if(x == 5)
			y = "Respect";
		else if(x == 6)
			y = "Self-sacrifice ";
		return y;
	}
	public static String Evil() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Domination";
		else if(x == 2)
			y = "Greed";
		else if(x == 3)
			y = "Might";
		else if(x == 4)
			y = "Pain";
		else if(x == 5)
			y = "Retribution";
		else if(x == 6)
			y = "Slaughter";
		return y;
	}
	public static String Lawful() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Community";
		else if(x == 2)
			y = "Fairness";
		else if(x == 3)
			y = "Honor";
		else if(x == 4)
			y = "Logic";
		else if(x == 5)
			y = "Responsibility";
		else if(x == 6)
			y = "Tradition";
		return y;
	}
	public static String Chaotic() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Change";
		else if(x == 2)
			y = "Creativity";
		else if(x == 3)
			y = "Freedom";
		else if(x == 4)
			y = "Independence";
		else if(x == 5)
			y = "No limits ";
		else if(x == 6)
			y = "Whimsy";
		return y;
	}
	public static String Neutral() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Balance";
		else if(x == 2)
			y = "Knowledge";
		else if(x == 3)
			y = "Live and let live";
		else if(x == 4)
			y = "Moderation";
		else if(x == 5)
			y = "Neutrality";
		else if(x == 6)
			y = "People";
		return y;
	}
	public static String Other() 
	{
		int x = Roll.roll(6, 1);
		String y = "";
		if(x == 1)
			y = "Aspiration";
		else if(x == 2)
			y = "Discovery";
		else if(x == 3)
			y = "Glory";
		else if(x == 4)
			y = "Nation";
		else if(x == 5)
			y = "Redemption";
		else if(x == 6)
			y = "Self-knowledge";
		return y;
	}

}
