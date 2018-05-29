package Xanthars_Character;

public class Birthplace {
	public static String birthplace(String race)
	{
		int x = Roll.roll(100,1);
		int z = Roll.roll(100, 1);
		String race2;
		String y = "";
		if(x <= 50)
			y += "Home";
		else if(x <= 55)
			y += "Home of a family friend";
		else if(x <= 63)
			y += "Home of a healer or midwife";
		else if(x <= 65)
			y += "Carriage, cart, or wagon";
		else if(x <= 68)
			y += "Barn, shed, or other outbuilding";
		else if(x <= 70)
			y += "Cave";
		else if(x <= 72)
			y += "Field";
		else if(x <= 74)
			y += "Forest";
		else if(x <= 77)
			y += "Temple";
		else if(x <= 78)
			y += "Battlefield";
		else if(x <= 80)
			y += "Alley or street";
		else if(x <= 82)
		{
			if(z<= 33)
				y += "Brothel";
			else
				y += "Tavern or inn";
		}
		else if(x <= 84)
			y += "Castle, keep, tower, or palace";
		else if(x <= 85)
			y += "Sewer or rubbish heap";
		else if(x <= 88)
		{
			y += "Among people of a different race";
			race2 = Supplemental.race();
			while(race == race2)
			{
				race2 = Supplemental.race();
			}
			y += " ("+race2+")";
		}
		else if(x <= 91)
			y += "On board a boat or a ship";
		else if(x <= 93) 
		{
			if(z<=50)
				y += "In a prison";
			else
				y += "In the headquarters of a secret organization";
		}
		else if(x <= 95)
			y += "In a sage’s laboratory";
		else if(x <= 96)
			y += "In the Feywild";
		else if(x <= 97)
			y += "in the Shadowfell";	
		else if(x <= 98)
		{
			if(z<=50)
				y += "On the Astral Plane";
			else
				y += "On the Ethereal Plane";
		}
		else if(x <= 99)
			y += "On an Inner Plane of your choice";
		else
			y += "On an Outer Plane ofyour choice";
		return y;
	}
}
