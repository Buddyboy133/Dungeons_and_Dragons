package Dungeon;

import java.util.Random;

public class Obstical {
	public static void obstical() {
		int x = roll(20,1);
		int z = roll(100,1);
		boolean h = false;
		String y ="";
		if (x <= 1)
			y = "Antilife aura with a radius of 1d10 x 10ft, while in the aura living creatures can't regain hit points ";
		else if(x <= 2)
			y = "Battering winds reduce speed by half, impose\r disadvantage on ranged attack rolls";
		else if(x <= 3)
			y = "Blade barrier blocks passage";
		else if(x <= 8)
			y = "Cave-in";
		else if(x <= 12)
			y = "Chasm 1d4 x 10ft. wide and 2d6 x 10ft. deep, possibly conneced to other levels of the dungeon";
		else if(x <= 14)
			y = "Flooding leaves 2d10 ft. of water in the area; create nearby upward-sloping passages, raised floors, or rising stairs to contain the water";
		else if(x <= 15)
		{
			y = "Lava flows through the area";
			if(z<=50)
				y += " with a stone bridge";
		}
		else if(x <= 16)
			y = "Overgrown mushrooms block progress and must be hacked down";
			if(z<= 25)
			{
				y += " with a hazard hidden";
				h = true;
			}
		else if(x <= 17)
			y = "Poisonous gas (deals 1d6 poison damage per minute of exposure)";
		else if(x <= 18)
			y = "Reverse gravity effect causes creatures to fall toward the ceiling";
		else if(x <= 19)
			y = "Wall of fire blocks passage";
		else if(x <= 20)
			y = "Wall of force blocks passage";
		System.out.println(y);
		if(h == true)
			Hazard.hazard();
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

