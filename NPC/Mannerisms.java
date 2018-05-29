package NPC;

public class Mannerisms {
	public static String mannerisms()
	{
		int x = Roll.roll(20,1);
		int z = Roll.roll(100, 1);
		String y = "Mannerisms: ";
		if(x == 1)
			y += "Prone to singing, whistling, or humming quietly";
		else if(x == 2)
			y += "Speaks in rhyme or some other peculiar way";
		else if(x == 3)
		{
			if (z <=50)
				y += "Particularly low voice";
			else
				y += "Particularly high voice";
		}
		else if(x == 4)
			y += "Slurs words, lisps, or stutters ";
		else if(x == 5)
			y += "Enunciates overly clearly ";
		else if(x == 6)
			y += "Speaks loudly";
		else if(x == 7)
			y += "Whispers";
		else if(x == 8)
			y += "Uses flowery speech or long words ";
		else if(x == 9)
			y += "Frequently uses the wrong word";
		else if(x == 10)
			y += "Uses colorful oaths and exclamations";
		else if(x == 11)
			y += "Makes constant jokes or puns ";
		else if(x == 12)
			y += "Prone to predictions of doom ";
		else if(x == 13)
			y += "Fidgets";
		else if(x == 14)
			y += "Squints";
		else if(x == 15)
			y += "Stares into the distance";
		else if(x == 16)
			y += "Chews something ";
		else if(x == 17)
			y += "Paces";
		else if(x == 18)
			y += "Taps fingers";
		else if(x == 19)
			y += "Bites fingernails";
		else 
			y += "Twirls hair or tugs beard";	
		return y;
	}

}
