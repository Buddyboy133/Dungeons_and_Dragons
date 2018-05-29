package NPC;

public class Alignment {
	public static String alignment()
	{
		int x = Roll.roll(6,3);
		int z = Roll.roll(100, 1);
		String y = "";
		if(x <= 3)
			if(z <=50)
				y = "Chaotic Evil";
			else
				y = "Chaotic Neutral";
		else if(x <= 5)
			y = "Lawful Evil";
		else if(x <= 8)
			y = "Neutral Evil";
		else if(x <= 12)
			y = "Neutral";
		else if(x <= 15)
			y = "Neutral Good";
		else if(x <= 17)
			if(z <= 50)
				y = "Lawful Good";
			else
				y = "Lawful Neutral";
		else if(x == 18)
			if(z <= 50)
				y = "Chaotic Good";
			else
				y = "Chaotic Neutral";
		return y;
	}
}
