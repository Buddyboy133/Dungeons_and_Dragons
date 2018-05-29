package Xanthars_Character;

public class Parents {
	public static String parents(String z)
	{
		int x = Roll.roll(100, 1);
		String y = "";
		if(x<=95)
			y += "You know who your parents are or were.";
		else
			y += "You do not know who your parents were.";
		x = Roll.roll(8, 1);
		if(z.equals("Half-elf"))
		{
			y += "\r\n";
			if(x <= 5)
				y += "One parent was an elf and the other was a human.";
			else if(x <= 6)
				y += "One parent was an elf and the other was a half-elf.";
			else if(x <= 7)
				y += "One parent was a human and the other was a half-elf.";
			else if(x <= 8)
				y += "Both parents were half—elves.";
		}
		if(z.equals("Half-orc"))
		{
			y += "\r\n";
			if(x <= 3)
				y += "One parent was an orc and the other was a human.";
			else if(x <= 5)
				y += "One parent was an ore and the other was a half- orc";
			else if(x <= 7)
				y += "One parent was a human and the other was a half- orc";
			else if(x <= 8)
				y += "Both parents were half-ores.";
		}
		if(z.equals("Tiefling"))
		{
			y += "\n";
			if(x <= 4)
				y += "Both parents were humans, their infernal heritage dormant until you came along.";
			else if(x <= 6)
				y += "One parent was a tiefling and the other was a human";
			else if(x <= 7)
				y += "One parent was a tiefling and the other was a devil.";
			else if(x <= 8)
				y += "One parent was a human and the other was a devil.";
		}
		return y;
	}

}
