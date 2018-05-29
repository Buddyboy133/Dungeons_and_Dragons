package Settlements;

import java.util.Scanner;

public class Multi_Building {
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many Buildings");
		int x = input.nextInt();
		for(int i = 1; i <= x; i++)
		{
			System.out.println("Building "+i+": " + Random_Building.building());
		}
	}
}
