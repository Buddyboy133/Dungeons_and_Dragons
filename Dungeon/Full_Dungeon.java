package Dungeon;

import java.util.Random;
import java.util.Scanner;

public class Full_Dungeon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many rooms? (including boss room)");
		int rn = input.nextInt();
		System.out.println("What cr?");
		int cr = input.nextInt();
		
		System.out.println("What is the boss?");
		String boss = input.next();
		String[][] monsters = Monsters.newmonsters();
		
		System.out.println("How many Dominant monsters are there (xdx, written x x)");
		int dZ = input.nextInt();
		int dX = input.nextInt();
		
		System.out.println("How many Ally/Pet monsters are there (xdx, written x x)");
		int pZ = input.nextInt();
		int pX = input.nextInt();
		
		System.out.println("How many Random monsters are there (xdx, written x x)");
		int rZ = input.nextInt();
		int rX = input.nextInt();
		
		int x = 0;
		for(int i = 1; i < rn; i++)
		{
			x = roll(100,1);
			if (x <= 8)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[0], dX, dZ);
				System.out.println("");
			}
			else if(x <= 15)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[0], dX, dZ);
				System.out.print("with ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
			else if(x <= 27)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[1], pX, pZ);
				System.out.println("");
			}
			else if(x <= 33)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[1], pX, pZ);
				System.out.print("guarding ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
			else if(x <= 42)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[2], rX, rZ);
				System.out.println("");
			}
			else if(x <= 50)
			{
				System.out.println("Room: "+i);
				Monsters.monsterroll(monsters[2], rX, rZ);
				System.out.print("with ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
			else if(x <= 58)
			{
				System.out.println("Room: "+i);
				Hazard.hazard();
				System.out.print("and ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
			else if(x <= 63)
			{
				System.out.println("Room: "+i);
				Obstical.obstical();
				System.out.println("");
			}
			else if(x <= 73)
			{
				System.out.println("Room: "+i);
				Trap.trap();
				System.out.println("");
			}
			else if(x <= 76)
			{
				System.out.println("Room: "+i);
				Trap.trap();
				System.out.print("and ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
			else if(x <= 80)
			{
				System.out.println("Room: "+i);
				Trick.trick();
				System.out.println("");
			}
			else if(x <= 88)
			{
				System.out.println("Room: "+i);
				System.out.println("Empty room ");
				System.out.println("");
			}
			else if(x <= 94)
			{
				System.out.println("Room: "+i);
				System.out.println("Empty room with ");
				Hazard.hazard();
				System.out.println("");
			}	
			else if(x <= 100)
			{
				System.out.println("Room: "+i);
				System.out.println("Empty room with ");
				Treasure.treasure(cr, false);
				System.out.println("");
			}
		}
		System.out.println("Boss: "+ boss + "\nguarding");
		Treasure.treasure(cr, true);
		System.out.println("");
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
