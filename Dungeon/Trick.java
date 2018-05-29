package Dungeon;

import java.util.Random;

public class Trick {
	public static void trick() {
		int x = roll(20,1);
		int z = roll(100,1);
		String r = "resistance";
		String y ="";
		if (x <= 1)
			y = "Book";
		else if(x <= 2)
			y = "Brain preserved in jar";
		else if(x <= 3)
			y = "Burning fire";
		else if(x <= 4)
			y = "Cracked gem";
		else if(x <= 5)
			y = "Door";
		else if(x <= 6)
			y = "Fresco";
		else if(x <= 7)
			y = "Furniture";
		else if(x <= 8)
			y = "Glass sculpture";
		else if(x <= 9)
			y = "Mushroom field";
		else if(x <= 10)
			y = "Painting";
		else if(x <= 11)
			y = "Plant or tree";
		else if(x <= 12)
			y = "Pool of water";
		else if(x <= 13)
			y = "Runes engraved on wall or floor";
		else if(x <= 14)
			y = "Skull";
		else if(x <= 15)
			y = "Sphere of magical energy";
		else if(x <= 16)
			y = "Statue";
		else if(x <= 17)
			y = "Stone obelisk";
		else if(x <= 18)
			y = "Suit of armor";
		else if(x <= 19)
			y = "Tapestry or rug";
		else if(x <= 20)
			y = "Target dummy";
		System.out.println("Trick");
		System.out.println("Object:"+y);
		x = roll(100,1);
		y ="";
		if (x <= 3)
			y = "Ages the first person to touch the object";
		else if(x <= 6)
			y = "The touched object animates, or it animates other objects nearby";
		else if(x <= 10)
			y = "Asks three skill-testing questions (if all three are answered correctly, a reward appears) ";
		else if(x <= 13)
		{
			if(z <= 50)
				r = "vulnerablilty";
			y = "Bestows " + r;
		}
		else if(x <= 16)
		{
			if (z <= 25)
				r = "alignment";
			else if(z <= 50)
				r = "personality";
			else if(z <= 75)
				r = "apperance";
			else
				r = "gender";
			y = "Changes a character's "+r+" when touched";
		}
		else if(x <= 19)
			y = "Changes one substance to another, such as gold to lead or metal to brittle crystal ";
		else if(x <= 22)
			y = "Creates a force field";
		else if(x <= 26)
			y = "Creates an illusion";
		else if(x <= 29)
			y = "Suppresses magic items for a time";
		else if(x <= 32)
		{
			if(z<= 50)
				r = "enlarges";
			else
				r = "reduces";
			y = r + "characters";
		}
		else if(x <= 35)
			y = "Magic mouth speaks a riddle";
		else if(x <= 38)
			y = "Confusion (targets all creatures within 10ft.)";
		else if(x <= 41)
		{
			if(z<= 50)
				r = "true)";
			else
				r = "false)";
			y = "Gives directions (" + r;
		}
		else if(x <= 44)
			y = "Grants a wish";
		else if(x <= 47)
			y = "Flies about to avoid being touched";
		else if(x <= 50)
			y = "Casts geas on the characters";
		else if(x <= 53)
			{
			if(z<= 25)
				r = "Increases";
			else if (z <= 50)
				r = "Reduces";
			else if (z <= 75)
				r = "Negates";
			else
				r = "Reverses";
			y = r + " gravity";
			}
		else if(x <= 56)
			y = "Induces greed";
		else if(x <= 59)
			y = "Contains an imprisoned creature";
		else if(x <= 62)
			y = "Locks or unlocks exits";
		else if(x <= 65)
			y = "Offers a game of chance, with the promise of a reward or valuable information";
		else if(x <= 68)
		{
			if(z<= 50)
				r = "helps";
			else
				r = "harms";
			y = r + " certian types of creatures";
		}
		else if(x <= 71)
			y = "Casts polymorph on the characters (lasts 1 hour)";
		else if(x <= 75)
			y = "Presents a puzzle or riddle";
		else if(x <= 78)
			y = "Prevents movement ";
		else if(x <= 81)
		{
			if(z<= 17)
				r = "coins";
			else if (z <= 33)
				r = "false coins";
			else if (z <= 50)
				r = "gems";
			else if (z <= 66)
				r = "false gems";
			else if (z <= 83)
				r = "magic item";
			else
				r = "map";
			y = "Releases "+r;
		}
		else if(x <= 84)
		{
			if(z<= 33)
				r = "Relases";
			else if (z <= 66)
				r = "Summons";
			else 
				r = "Turns into";
			y = r + " a montser";
		}
		else if(x <= 87)
			y = "Casts suggestion on the characters";
		else if(x <= 90)
			y = "Wails loudly when touched";
		else if(x <= 93)
		{
			if(z<= 17)
				r = "normal speech";
			else if (z <= 33)
				r = "nonsense";
			else if (z <= 50)
				r = "poetry and rhymes";
			else if (z <= 66)
				r = "singing";
			else if (z <= 83)
				r = "spellcasting";
			else
				r = "screaming";
			y = "Talks(" + r + ")";
		}
		else if(x <= 97)
			y = "Teleports characters to another place";
		else if(x <= 100)
			y = "Swaps two or more characters' minds";
		System.out.println(y);
	}
	public static int roll(int x, int y)
	{
		Random random = new Random();
		int z = 0;
		for(int i = 0; i < y; i++)
			z += (random.nextInt(x) + 1);
		return z; 
	}
}
