package Settlements;

public class Calamity {

	public static void main(String[] args) {
		System.out.println(calamity());
	}

	public static String calamity() {
		int x = Roll.roll(20,1);
		String y = "Calamity: ";
		if(x == 1)
			y += "Suspected vampire infestation ";
		else if(x == 2)
			y += "New cult seeks converts";
		else if(x == 3)
			y += "Important figure died (murder suspected)";
		else if(x == 4)
			y += "War between rival thieves' guilds";
		else if(x <= 6)
			y += "Plague or famine (sparks riots)";
		else if(x == 7)
			y += "Corrupt officials";
		else if(x <= 9)
			y += "Marauding monsters";
		else if(x == 10)
			y += "Powerful wizard has moved into town";
		else if(x == 11)
			y += "Economic depression (trade disrupted) ";
		else if(x == 12)
			y += "Flooding";
		else if(x == 13)
			y += "Undead stirring in cemeteries";
		else if(x == 14)
			y += "Prophecy of doom";
		else if(x == 15)
			y += "Brink of war";
		else if(x == 16)
			y += "Internal strife (leads to anarchy)";
		else if(x == 17)
			y += "Besieged by enemies ";
		else if(x == 18)
			y += "Scandal threatens powerful families";
		else if(x == 19)
			y += "Dungeon discovered (adventurers flock to town) ";
		else 
			y += "Religious sects struggle for power ";
		return y;
	}
	
	

}
