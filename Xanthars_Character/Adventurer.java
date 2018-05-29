package Xanthars_Character;

import Naming.Random_Name;
import Naming.Roll;

public class Adventurer {
	public static String adventurer()
	{
		String y = "";
		String race = Supplemental.race();
		String nrace = race;
		String subrace = Subrace(race);
		String gender = Supplemental.gender();
		if(nrace.equals("Half-elf"))
		{
			if(Roll.roll(100, 1)<= 50)
				nrace = "Elf";
			else
				nrace = "Human";
		}
		if(nrace.equals("Human"))
			nrace = Random_Name.humanConversion();
		String name = Random_Name.naming(nrace, gender.replace(" ", ""));
		y += "\r\n\tName: "+ name;
		y += "\r\n\tRace: "+ gender + subrace;
		y += "\r\n\tAge: "+ Supplemental.age(race);
		y += "\r\n\tClass: "+ Supplemental.rclass();
		y += "\r\n\tAlignment: " + Supplemental.alignment();
		y += "\r\n\tStatus: " + Supplemental.status();
		return y;
	}
	
	public static String Subrace(String race) 
	{
		String x = race;
		int z = Roll.roll(100, 1);
		if(x == "Dwarf")
		{
			if(z <= 50)
			{
				x = "Hill Dwarf";
			}
			else
			{
				x = "Mountian Dwarf";
			}
		}
		else if(x == "Elf")
		{
			if(z == 100)
				z = Roll.roll(99,1);
			if(z <= 33)
			{
				x = "Wood Elf";
			}
			else if(z <= 66)
			{
				x = "High Elf";
			}
			else 
			{
				x = "Dark Elf";
			}
		}
		else if(x == "Halfling")
		{
			if(z <= 50)
			{
				x = "Lightfoot Halfling";
			}
			else
			{
				x = "Stout Halfling";
			}
		}
		else if(x == "Dragonborn")
		{
			if(z <= 10)
				x = "Black";
			else if(z <= 20)
				x = "Blue";
			else if(z <= 30)
				x = "Brass";
			else if(z <= 40)
				x = "Bronze";
			else if(z <= 50)
				x = "Copper";
			else if(z <= 60)
				x = "Gold";
			else if(z <= 70)
				x = "Green";
			else if(z <= 80)
				x = "Red";
			else if(z <= 90)
				x = "Silver";
			else 
				x = "White";
			x += " Dragonborn";
		}
		else if(x == "Gnome")
		{
			if(z <= 50)
			{
				x = "Forest Gnome";
			}
			else
			{
				x = "Rock Gnome";
			}
			
		}
		return x;
	}
}
