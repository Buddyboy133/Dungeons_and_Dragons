package Xanthars_Character;

import NPC.Roll;

public class Supplemental {
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
	public static String death()
	{
		int x = Roll.roll(20,1);
		String y = "";
		if(x <= 1)
			y += "Unknown";
		else if(x <= 2)
			y += "Murdered";
		else if(x <= 3)
			y += "Killed in battle";
		else if(x <= 4)
			y += "Accident related to class or occupation";
		else if(x <= 5)
			y += "Accident unrelated to class or occupation";
		else if(x <= 7)
			y += "Natural causes, such as disease or old age";
		else if(x <= 8)
			y += "Apparent suicide";
		else if(x <= 9)
			y += "Torn apart by an animal or a natural disaster";
		else if(x <= 10)
			y += "Consumed by a monster";
		else if(x <= 11)
			y += "Executed for a crime or tortured to death";
		else
			y += "Bizarre event, such as being hit by a meteorite,\r\n" + 
					"struck down by an angry god, or killed by a hatching\r\n" + 
					"slaad egg";	
		return y;
	}
	public static String rclass()
	{
		String y = "";
		int x = Roll.roll(100,1);
		if (x <= 7)
			y = "Barbarian";
		else if (x <= 14)
			y = "Bard";
		else if (x <= 29)
			y = "Cleric";
		else if (x <= 36)
			y = "Druid";
		else if(x <= 52)
			y = "Fighter";
		else if(x <= 58)
			y = "Monk";
		else if(x <= 64)
			y = "Paladin";
		else if(x <= 70)
			y = "Ranger";
		else if(x <= 84)
			y = "Rogue";
		else if(x <= 89)
			y = "Sorcerer";
		else if(x <= 94)
			y = "Warlock";
		else 
			y = "Wizard";
		return y;
	}
	public static String occupation()
	{
		int x = Roll.roll(100,1);
		String y = "";
		if(x <= 5)
			y += "Academic";
		else if(x <= 10)
			y += "Adventurer: " + Supplemental.rclass();
		else if(x <= 11)
			y += "Aristocrat";
		else if(x <= 26)
			y += "Artisan or guild member";
		else if(x <= 31)
			y += "Criminal";
		else if(x <= 36)
			y += "Entertainer";
		else if(x <= 38)
			y += "Exile, hermit, or refugee";
		else if(x <= 43)
			y += "Explorer or wanderer";
		else if(x <= 55)
			y += "Farmer or herder";
		else if(x <= 60)
			y += "Hunter or trapper";
		else if(x <= 75)
			y += "Laborer";
		else if(x <= 80)
			y += "Merchant";
		else if(x <= 85)
			y += "Politician or bureaucrat";
		else if(x <= 90)
			y += "Priest";
		else if(x <= 95)
			y += "Sailor";
		else 
			y += "Soldier";
		return y;
	}
	public static String race()
	{
		int x = Roll.roll(95,1);
		String y ="";
		if (x <= 40)
			y = "Human";
		else if(x <= 50)
			y = "Dwarf";
		else if(x <= 60)
			y = "Elf";
		else if(x <= 70)
			y = "Halfling";
		else if(x <= 75)
			y = "Dragonborn";
		else if(x <= 80)
			y = "Gnome";
		else if(x <= 85)
			y = "Half-elf";
		else if(x <= 90)
			y = "Half-orc";
		else if(x <= 95)
			y = "Tiefling";
		return y;
	}
	public static String gender()
	{
		int x = Roll.roll(100,1);
		String y = "";
		if(x <= 50)
			y = "Male " + y;
		else
			y = "Female " + y;
		return y;
	}
	public static int age(String race)
	{
		String x = race;
		int y = 0;
		int z = Roll.roll(100, 1);
		if(race == "Human")
		{
			y = 15;
			if(z <= 50)
				y = y + Roll.roll(6, 2);
			else
				y = y + Roll.roll(55, 1);
		}
		else if(race =="Dwarf")
		{
			y = 39;
			if(z <= 50)
				y = y + Roll.roll(6, 7);
			else
				y = y+ Roll.roll(105,2);
		}
		else if(x == "Elf")
		{
			y = 109;
			if(z <= 50)
				y = y + Roll.roll(6, 10);
			else
				y = y + Roll.roll(120, 2);
		}
		else if(x == "Halfling")
		{
			y = 20;
			if(z <= 50)
				y = y + Roll.roll(6, 4);
			else
				y = y + Roll.roll(40,2);
		}
		else if(x == "Dragonborn")
		{
			y = 15;
			if(z <= 50)
				y = y + Roll.roll(6, 2);
			else
				y = y + Roll.roll(55, 1);
		}
		else if(x == "Gnome")
		{
			y = 39;
			if(z <= 50)
				y = y + Roll.roll(6, 9);
			else
				y = y + Roll.roll(80, 2);
		}
		else if(x == "Half-elf")
		{
			y = 20;
			if(z <= 50)
				y = y + Roll.roll(6, 3);
			else
				y = y + Roll.roll(105, 1);
		}
		else if(x ==  "Half-orc")
		{
			y = 14;
			if(z <= 50)
				y = y + Roll.roll(6, 2);
			else
				y = y + Roll.roll(46, 1);
		}
		else if(x == "Tiefling")
		{
			y = 15;
			if(z <= 50)
				y = y + Roll.roll(6, 2);
			else
				y = y + Roll.roll(55, 1);
		}
		return y;
	}
	public static String relationship()
	{
		int x = Roll.roll(4, 3);
		String y = "";
		if(x <= 4)
			y += "Hostile";
		else if(x <= 10)
			y += "Friendly";
		else
			y += "Indifferent";
		return y;
	}
	public static String status()
	{
		int x = Roll.roll(6,3);
		String y = "";
		if(x <= 3)
			y += "Dead " + death();
		else if(x <= 5)
			y += "Missing or unknown";
		else if(x <= 8)
			y += "Alive, but doing poorly due to injury, financial trouble, or relationship difficulties";
		else if(x <= 12)
			y += "Alive and well";
		else if(x <= 15)
			y += "Alive and quite successful";
		else if(x <= 17) 
			y += "Alive and infamous";
		else 
			y += "Alive and famous";
		return y;
	}
	
}
