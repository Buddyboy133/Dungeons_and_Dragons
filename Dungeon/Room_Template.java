package Dungeon;

import java.util.Scanner;
import java.util.Random;

public class Room_Template {
	
	public static void nocrtemplate()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What cr?");
		template(input.nextInt());
		
	}
	public static void template(int rating)
	{
		int x = roll(100,1);
		int cr = rating;
		String y = "";
		if (x <= 8)
		{
			System.out.println("Monster (dominant inhabitant)");
		}
		else if(x <= 15)
		{
			System.out.println("Monster (dominant inhabitant) with ");
			Treasure.treasure(cr, false);
		}
		else if(x <= 27)
		{
			System.out.println("Monster (pet or allied creature)");
		}
		else if(x <= 33)
		{
			System.out.println("Monster (pet or allied creature) guarding ");
			Treasure.treasure(cr, false);
		}
		else if(x <= 42)
		{
			System.out.println("Monster (random creature)");
		}
		else if(x <= 50)
		{
			System.out.println("Monster (random creature) with treasure");
			Treasure.treasure(cr, false);
		}
		else if(x <= 58)
		{
			Hazard.hazard();
			System.out.print("and ");
			Treasure.treasure(cr, false);
		}
		else if(x <= 63)
			Obstical.obstical();
		else if(x <= 73)
			Trap.trap();
		else if(x <= 76)
		{
			Trap.trap();
			System.out.print("and ");
			Treasure.treasure(cr, false);
		}
		else if(x <= 80)
			Trick.trick();
		else if(x <= 88)
			System.out.println("Empty room ");
		else if(x <= 94)
		{
			System.out.println("Empty room with ");
			Hazard.hazard();
		}	
		else if(x <= 100)
		{
			System.out.println("Empty room with ");
			Treasure.treasure(cr, false);
		}
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
