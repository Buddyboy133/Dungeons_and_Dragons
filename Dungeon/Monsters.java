package Dungeon;

import java.util.Random;
import java.util.Scanner;

public class Monsters {
	public static String[][] newmonsters()
	{
		Scanner input = new Scanner(System.in);
		String[][] monsters = new String[3][1];
		//monster[0] is Domain
		System.out.println("How many different Domain monsters are there?");
		int x = input.nextInt();
		System.out.println("How many different Ally/Pet monsters are there?");
		int y = input.nextInt();
		System.out.println("How many different Random monsters are there?");
		int z = input.nextInt();
		monsters[0] = new String[x];
		monsters[1] = new String[y];
		monsters[2] = new String[z];
		for(int i = 0; i < x; i++)
		{
			System.out.println("What is Domain monster number "+(i+1));
			monsters[0][i] = input.next();
		}
		//monster[1] is ally
		for(int i = 0; i < y; i++)
		{
			System.out.println("What is Ally/Pet monster number "+(i+1));
			monsters[1][i] = input.next();
		}
		//monster[2] is random
		for(int i = 0; i < z; i++)
		{
			System.out.println("What is Random monster number "+(i+1));
			monsters[2][i] = input.next();
		}
		return monsters;
	}
	public static String[][] monsters(String[][] Monsters)
	{
		String[][] monsters = Monsters;
		return monsters;
	}
	public static void monsterroll(String [] Monsters, int X, int Z)
	{
		int x = X;
		int z = Z;
		int w = roll(x,z);
		String[] monsters = Monsters;
		int y = monsters.length;
		int v = roll(y,1) - 1;
		System.out.println("There are "+w+ " "+monsters[v]+"(s)");
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
