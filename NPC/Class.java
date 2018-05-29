package NPC;

public class Class {
	public static String lordclass()
	{
		String x = "";
		int y = Roll.roll(11,1);
		if (y == 0 || y == 1 || y == 2|| y == 3 || y == 4||y == 5 || y == 6|| y == 7 || y == 8)
			x = "Fighter";
		if (y == 9|| y == 10)
			x = "Archer";
		if (y == 11)
			x = "Wizard";
		if (y == 12)
			x = "Paladin";
		return x;
	}
	public static String genclass()
	{
		String y = "";
		int x = Roll.roll(16,1);
		if (x == 1)
			y = "Barbarian";
		else if (x == 2)
			y = "Bard";
		else if (x <= 4)
			y = "Cleric";
		else if (x == 5)
			y = "Druid";
		else if(x <= 7)
			y = "Fighter";
		else if(x == 8)
			y = "Monk";
		else if(x == 9)
			y = "Paladin";
		else if(x == 10)
			y = "Ranger";
		else if(x <= 12)
			y = "Rogue";
		else if(x <= 14)
			y = "Sorcerer";
		else if(x == 15)
			y = "Warlock";
		else 
			y = "Wizard";
		return y;
	}
}
