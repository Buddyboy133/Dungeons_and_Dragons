package NPC;

public class Race {
	public static String race()
	{
		int x = Roll.roll(100,1);
		String y ="";
		if (x <= 45)
			y = "Human";
		else if(x <= 55)
			y = "Dwarf";
		else if(x <= 65)
			y = "Elf";
		else if(x <= 75)
			y = "Halfling";
		else if(x <= 80)
			y = "Dragonborn";
		else if(x <= 85)
			y = "Gnome";
		else if(x <= 90)
			y = "Half-elf";
		else if(x <= 95)
			y = "Half-orc";
		else if(x <= 100)
			y = "Tiefling";
		x = Roll.roll(100,1);
		if(x<=75)
			y = "Male " + y;
		else
			y = "Female " + y;
		return y;
	}
	
}
