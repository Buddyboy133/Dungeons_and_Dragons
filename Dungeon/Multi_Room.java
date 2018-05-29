package Dungeon;

import java.util.Scanner;
import java.util.Random;

public class Multi_Room {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int z = 0;
		int x = 0;
		int w = 0;
		while(z != -1)
		{
			System.out.println("What CR? (-1 to quit)");
			w = input.nextInt();
			if(w != -1)
			{
				System.out.println("How many Rooms? (-1 to quit)");
				z = input.nextInt();
			}
			else
				z = -1;
			x = 0;
			for(int i = 1; i <= z; i++)
			{
				System.out.println("Room "+i+":");
				Room_Template.template(w);
				System.out.println("");
			}	
	}

	}

}
