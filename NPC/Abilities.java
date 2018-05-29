package NPC;

public class Abilities {
	public static String abilities()
	{
		String y = "";
		int x = Roll.roll(6, 1);
		int z = Roll.roll(6, 1);
		while(x == z)
			z = Roll.roll(6, 1);
		y += high(x);
		y += "\n";
		y += low(z);
		return y;
	}
	public static String high(int x)
	{
		String y = "High Ability: ";
		if(x == 1)
			y += "Strength-powerful, brawny, strong as an ox";
		else if(x == 2)
			y += "Dexterity-lithe, agile, graceful ";
		else if(x == 3)
			y += "Constitution-hardy, hale, healthy";
		else if(x == 4)
			y += "Intelligence-studious, learned, inquisitive ";
		else if(x == 5)
			y += "Wisdom-perceptive, spiritual, insightful ";
		else if(x == 6)
			y += "Charisma-persuasive, forceful, born leader ";
		return y;
	}
	public static String low(int x)
	{
		String y = "Low Ability: ";
		if(x == 1)
			y += "Strength-feeble, scrawny";
		else if(x == 2)
			y += "Dexterity-clumsy, fumbling";
		else if(x == 3)
			y += "Constitution-sickly, pale";
		else if(x == 4)
			y += "Intelligence-dim-witted, slow";
		else if(x == 5)
			y += "Wisdom-oblivious, absentminded ";
		else if(x == 6)
			y += "Charisma-dull, boring";
		return y;
	}
}
