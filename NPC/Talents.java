package NPC;

public class Talents {
	public static String talents()
	{
		int x = Roll.roll(20, 1);
		String y = "Talents: ";
		if(x == 1)
			y += "Plays a musical instrument";
		else if(x == 2)
			y += "Speaks several languages fluently";
		else if(x == 3)
			y += "Unbelievably lucky";
		else if(x == 4)
			y += "Perfect memory";
		else if(x == 5)
			y += "Great with animals";
		else if(x == 6)
			y += "Great with children ";
		else if(x == 7)
			y += "Great at solving puzzles";
		else if(x == 8)
			y += "Great at one game";
		else if(x == 9)
			y += "Great at impersonations";
		else if(x == 10)
			y += "Draws beautifully";
		else if(x == 11)
			y += "Paints beautifully";
		else if(x == 12)
			y += "Sings beautifully";
		else if(x == 13)
			y += "Drinks everyone under the table";
		else if(x == 14)
			y += "Expert carpenter";
		else if(x == 15)
			y += "Expert cook";
		else if(x == 16)
			y += "Expert dart thrower and rock skipper";
		else if(x == 17)
			y += "Expert juggler";
		else if(x == 18)
			y += "Skilled actor and master of disguise";
		else if(x == 19)
			y += "Skilled dancer";
		else 
			y += "Knows thieves' cant";
		
		return y;
	}
}
