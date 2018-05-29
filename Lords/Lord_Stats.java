package Lords;

import java.util.Random;

public class Lord_Stats {

	public static void main(String[] args) {
		System.out.println(Class());
		System.out.println(race());
		System.out.println(age());
		System.out.println(alignment());
	}
	public static String Class()
	{
		String x = "";
		int y = roll(11,1);
		if (y == 0 || y == 1 || y == 2|| y == 3 || y == 4||y == 5 || y == 6|| y == 7 || y == 8)
			x = "Fighter";
		if (y == 9|| y == 10)
			x = "Archer";
		if (y == 11)
			x = "Wizard";
		if (y == 12)
			x = "Paladin";
		return x;
	}
	public static String age()
	{
		int x = roll(6,1);
		String y = "";
		if(x <= 2)
			y = "Young adult";
		else if(x <= 4)
			y = "Adult";
		else if(x <= 5)
			y = "Middle Age";
		else if(x <= 6)
			y = "Elderly";
		return y;
	}
	public static String race()
	{
		int x = roll(100,1);
		String y ="";
		if (x <= 45)
			y = "Human";
		else if(x <= 55)
			y = "Dwarf";
		else if(x <= 65)
			y = "Elf";
		else if(x <= 75)
			y = "Halfling";
		else if(x <= 80)
			y = "Dragonborn";
		else if(x <= 85)
			y = "Gnome";
		else if(x <= 90)
			y = "Half-elf";
		else if(x <= 95)
			y = "Half-orc";
		else if(x <= 100)
			y = "Tiefling";
		x = roll(100,1);
		if(x<=75)
			y = "Male " + y;
		else
			y = "Female " + y;
		return y;
	}
	public static String alignment()
	{
		int x = roll(6,3);
		int z = roll(100, 1);
		String y = "";
		if(x <= 3)
			if(z <=50)
				y = "Chaotic Evil";
			else
				y = "Chaotic Neutral";
		else if(x <= 5)
			y = "Lawful Evil";
		else if(x <= 8)
			y = "Neutral Evil";
		else if(x <= 12)
			y = "Neutral";
		else if(x <= 15)
			y = "Neutral Good";
		else if(x <= 17)
			if(z <= 50)
				y = "Lawful Good";
			else
				y = "Lawful Neutral";
		else if(x == 18)
			if(z <= 50)
				y = "Chaotic Good";
			else
				y = "Chaotic Neutral";
		return y;
		
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
