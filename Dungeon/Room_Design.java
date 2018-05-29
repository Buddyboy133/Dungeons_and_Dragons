package Dungeon;

import java.util.Scanner;
import java.util.Random;

public class Room_Design {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
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
