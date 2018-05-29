package Dungeon;

import java.util.Random;

public class Trap {
	public static void trap()
	{
		int x = roll(6,1);
		String y ="";
		if (x <= 2)
			y = "Setback Trap";
		else if(x <= 5)
			y = "Dangerous Trap";
		else if(x <= 6)
			y = "Deadly Trap";
		x = roll(6,1);
		System.out.println(y);
		if(x <= 1)
			y = "Stepped on (floor, stairs)";
		else if(x <= 2)
			y = "Moved through (doorway, hallway)";
		else if(x <= 3)
			y = "Touched (doorknob, statue)";
		else if(x <= 4)
			y = "Opened (door, treasure chest)";
		else if(x <= 5)
			y = "Looked at (mural, arcane symbol) ";
		else if(x <= 6)
			y = "Moved (cart, stone block)";
		y = "Trigger type: "+y;
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
