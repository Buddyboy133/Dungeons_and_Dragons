package Runable_Files;

import java.util.Scanner;

import Naming.Random_Name;

public class Name {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Race & Gender needed");
		String race = input.next();
		String gender = input.next();
		for(int i = 0; i < 10; i ++)
			System.out.println(Random_Name.naming(race, gender));
		input.close();
	}
}
