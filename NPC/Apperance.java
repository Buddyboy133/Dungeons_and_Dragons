package NPC;

public class Apperance {
	public static String apperance()
	{
		int x = Roll.roll(20, 1);
		String y = "Apperance: ";
		if(x == 1)
			y += "Distinctive jewelry: earrings, necklace, circlet, bracelets";
		else if(x == 2)
			y += "Piercings";
		else if(x == 3)
			y += "Flamboyant or outlandish clothes";
		else if(x == 4)
			y += "Formal, clean clothes ";
		else if(x == 5)
			y += "Ragged, dirty clothes ";
		else if(x == 6)
			y += "Pronounced scar";
		else if(x == 7)
			y += "Missing teeth ";
		else if(x == 8)
			y += "Missing fingers ";
		else if(x == 9)
			y += "Unusual eye color (or two different colors) ";
		else if(x == 10)
			y += "Tattoos";
		else if(x == 11)
			y += "Birthmark";
		else if(x == 12)
			y += "Unusual skin color";
		else if(x == 13)
			y += "Bald";
		else if(x == 14)
			y += "Braided beard or hair";
		else if(x == 15)
			y += "Unusual hair color";
		else if(x == 16)
			y += "Nervous eye twitch ";
		else if(x == 17)
			y += "Distinctive nose ";
		else if(x == 18)
			y += "Distinctive posture (crooked or rigid) ";
		else if(x == 19)
			y += "Exceptionally beautiful";
		else 
			y += "Exceptionally ugly";
		
		return y;
		
	}

}
