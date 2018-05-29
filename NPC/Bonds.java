package NPC;

public class Bonds {
	public static String bonds()
	{
		int x1 = Roll.roll(10, 1);
		int x2 = Roll.roll(9, 1);
		String y = "";
		if(x1 != 10)
			y = thing(x1);
		else 
		{
			x1 = Roll.roll(9, 1);
			while(x1 == x2)
			{
				x1 = Roll.roll(9,1);
			}
			y = thing(x1);
			y += "\n";
			y += thing(x2);
		}
		return y;
	}
	public static String thing(int x)
	{
		String y = "Bond: ";
		if(x == 1)
			y += "Dedicated to fulfilling a personal life goal";
		else if(x == 2)
			y += "Protective of close family members";
		else if(x == 3)
			y += "Protective of colleagues or compatriots";
		else if(x == 4)
			y += "Loyal to a benefactor, patron, or employer";
		else if(x == 5)
			y += "Captivated by a romantic interest";
		else if(x == 6)
			y += "Drawn to a special place";
		else if(x == 7)
			y += "Protective of a sentimental keepsake";
		else if(x == 8)
			y += "Protective of a valuable possession";
		else
			y += "Out for revenge";
		return y;
	}
}
