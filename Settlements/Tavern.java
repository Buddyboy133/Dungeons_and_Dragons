package Settlements;

public class Tavern {
	public static void main(String[] args) {
		System.out.println(tavern());
	}
	public static String tavern() {
		return tavernName() + "\n" + type();
		
	}

	private static String tavernName() {
		// TODO Auto-generated method stub
		String x = part1();
		String y = part2();
		return "Tavern Name: " + x + " " + y;
	}
	private static String part1() {
		int x = Roll.roll(20,1);
		String y = "The ";
		if(x == 1)
			y += "Silver";
		else if(x == 2)
			y += "Golden";
		else if(x == 3)
			y += "Staggering";
		else if(x == 4)
			y += "Laughing";
		else if(x == 5)
			y += "Prancing";
		else if(x == 6)
			y += "Gilded";
		else if(x == 7)
			y += "Running";
		else if(x == 8)
			y += "Howling";
		else if(x == 9)
			y += "Slaughtered";
		else if(x == 10)
			y += "Leering";
		else if(x == 11)
			y += "Drunken";
		else if(x == 12)
			y += "Leaping";
		else if(x == 13)
			y += "Roaring";
		else if(x == 14)
			y += "Frowning";
		else if(x == 15)
			y += "Lonely";
		else if(x == 16)
			y += "Wandering";
		else if(x == 17)
			y += "Mysterious";
		else if(x == 18)
			y += "Barking";
		else if(x == 19)
			y += "Black";
		else 
			y += "Gleaming";	
		return y;
	}
	private static String part2() {
		int x = Roll.roll(20,1);
		String y = "";
		if(x == 1)
			y += "Eel";
		else if(x == 2)
			y += "Dolphin";
		else if(x == 3)
			y += "Dwarf";
		else if(x == 4)
			y += "Pegasus";
		else if(x == 5)
			y += "Pony";
		else if(x == 6)
			y += "Rose";
		else if(x == 7)
			y += "Stag";
		else if(x == 8)
			y += "Wolf";
		else if(x == 9)
			y += "Lamb";
		else if(x == 10)
			y += "Demon";
		else if(x == 11)
			y += "Goat";
		else if(x == 12)
			y += "Spirit";
		else if(x == 13)
			y += "Horde";
		else if(x == 14)
			y += "Jester";
		else if(x == 15)
			y += "Mountain";
		else if(x == 16)
			y += "Eagle";
		else if(x == 17)
			y += "Satyr";
		else if(x == 18)
			y += "Dog";
		else if(x == 19)
			y += "Spider";
		else 
			y += "Star";	
		return y;
	}
	public static String type()
	{
		int x = Roll.roll(20,1);
		String y = "Tavern Type: ";
		if(x <= 5)
			y += "Quiet, low-key bar";
		else if(x <= 9)
			y += "Raucous dive ";
		else if(x == 10)
			y += "Thieves' guild hangout ";
		else if(x == 11)
			y += "Gathering place for a secret society ";
		else if(x <= 13)
			y += "Upper-class dining club";
		else if(x <= 15)
			y += "Gambling den ";
		else if(x <= 17)
			y += "Caters to specific race or guild";
		else if(x == 18)
			y += "Members-only club";
		else 
			y += "Brothel";	
		return y;
	}


}
