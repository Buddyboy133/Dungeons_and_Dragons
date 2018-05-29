package Dungeon;

import java.util.Scanner;

public class Single_Event {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[][] monsters = null;
		int z = 0;
		int x = 0;
		int y = 0;
		while(z != -1)
		{
		System.out.println("Choose a path: Trick(1), Trap(2), Obstical(3), Hazard(4), Treasure(5), Monsters(6), Single Room(7), Quit(-1)");
		z = input.nextInt();
		if(z == 1)
			Trick.trick();
		else if(z == 2)
			Trap.trap();
		else if(z == 3)
			Obstical.obstical();
		else if(z == 4)
			Hazard.hazard();
		else if(z == 5)
			Treasure.newtreasure();
		else if(z == 6) 
		{
			System.out.println("How many monsters? (xdx, typed x x)");
			y = input.nextInt();
			x = input.nextInt();
			if(monsters != null)
			{
				System.out.println("New monsters? (1 for yes)");
				if(input.nextInt() == 1)
					monsters = Monsters.newmonsters();
			}
			else
				monsters = Monsters.newmonsters();
			Monsters.monsterroll(monsters[0], x, y);
			
		}
		else if(z == 7)
			Room_Template.nocrtemplate();
		}
	}
}
