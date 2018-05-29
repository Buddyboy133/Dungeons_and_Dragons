package NPC;

public class Flaws {

	public static String flaws() {
		int x = Roll.roll(12,1);
		String y = "Flaw or Secret: ";
		if(x == 1)
			y += "Forbidden love or susceptibility to romance";
		else if(x == 2)
			y += "Enjoys decadent pleasures ";
		else if(x == 3)
			y += "Arrogance";
		else if(x == 4)
			y += "Envies another creature's possessions or station";
		else if(x == 5)
			y += "Overpowering greed";
		else if(x == 6)
			y += "Prone to rage";
		else if(x == 7)
			y += "Has a powerful enemy";
		else if(x == 8)
			y += "Specific phobia ";
		else if(x == 9)
			y += "Shameful or scandalous history";
		else if(x == 10)
			y += "Secret crime or misdeed";
		else if(x == 11)
			y += "Possession of forbidden lore";
		else 
			y += "Foolhardy bravery";
		return y;
	}

}
