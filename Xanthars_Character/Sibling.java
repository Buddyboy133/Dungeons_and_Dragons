package Xanthars_Character;

import Naming.Random_Name;
import Naming.Roll;

public class Sibling {
	public static int numsiblings(String race)
	{
		int x = Roll.roll(10,1);
		int z = 0;
		if(race == "Elf" || race == "Dwarf")
			x = x - 2;
		if(x <= 2)
			z = 0;
		else if(x <= 4)
			z = Roll.roll(3, 1);
		else if(x <= 6)
			z = Roll.roll(4, 1) + 1;
		else if(x <= 8)
			z = Roll.roll(6, 1) + 2;
		else if(x <= 10)
			z = Roll.roll(8, 1) + 3;
		return z;
	}
	
	public static String siblingage()
	{
		String y = "";
		int x = Roll.roll(6, 2);
		if(x <= 2)
			y += "Twin,  Triplet, or Quadruplet";
		else if(x <= 7)
			y += "Older";
		else 
			y += "Younger";
		return y;
	}
	
	public static String sibling_stats(String race,String nrace)
	{
		if(nrace.equals("Half-elf"))
		{
			if(Roll.roll(100, 1)<= 50)
				race = "Elf";
			else
				race = "Human";
		}
		if(nrace.equals("Human"))
			nrace = Random_Name.humanConversion();
		String o = siblingage();
		String gender = Supplemental.gender();
		if(o != "Twin,  Triplet, or Quadruplet")
			o += " sibling";
		String y = Random_Name.firstName(nrace, gender)+" is a " + gender + race
				+ " "+Background.background()+" that is your " + o +".";
		y += "\r\n\tJob: " + Supplemental.occupation();
		y += "\r\n\tAlignment: " + Supplemental.alignment();
		y += "\r\n\tRelationship: " + Supplemental.relationship();
		y += "\r\n\tStatus: " + Supplemental.status();
		return y;
	}
}
