package Xanthars_Character;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Multi_Character {

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many Characters?");
		int x = input.nextInt();
		for(int i = 0; i < x; i++)
		{
			Random_PCWriter.main(args);
		}

	}

}
