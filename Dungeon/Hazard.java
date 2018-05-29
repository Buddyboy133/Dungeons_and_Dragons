package Dungeon;

import java.util.Random;

public class Hazard {
	public static void hazard()
	{
		int x = roll(20,1);
		String y ="";
		if (x <= 3)
			y = "Brown mold";
		else if(x <= 8)
			y = "Green slime";
		else if(x <= 10)
			y = "Shrieker";
		else if(x <= 15)
			y = "Spiderwebs";
		else if(x <= 17)
			y = "Violet fungus";
		else if(x <= 20)
			y = "Yellow mold";
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
