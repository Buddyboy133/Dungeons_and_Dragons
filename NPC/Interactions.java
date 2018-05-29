package NPC;

public class Interactions {
	public static String interactions()
	{
		int x = Roll.roll(12,1);
		String y = "Interaction Traits: ";
				if(x == 1)
					y += "Argumentative";
				else if(x == 2)
					y += "Arrogant";
				else if(x == 3)
					y += "Blustering";
				else if(x == 4)
					y += "Rude";
				else if(x == 5)
					y += "Curious";
				else if(x == 6)
					y += "Friendly";
				else if(x == 7)
					y += "Honest";
				else if(x == 8)
					y += "Hot tempered ";
				else if(x == 9)
					y += "Irritable";
				else if(x == 10)
					y += "Ponderous";
				else if(x == 11)
					y += "Quiet";
				else
					y += "Suspicious";
				
				return y;
	}

}
