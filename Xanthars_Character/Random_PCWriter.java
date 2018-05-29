package Xanthars_Character;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import Naming.Random_Name;

public class Random_PCWriter {
	static int STR = 0;
	static int DEX = 0;
	static int CON = 0;
	static int INT = 0;
	static int WIS = 0; 
	static int CHA = 0;
	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		PrintWriter writer = null;
		
		String race = Supplemental.race();
		int age = Supplemental.age(race);
		int numsiblings = (Sibling.numsiblings(race));
		String gender = Supplemental.gender();
		String rclass = Supplemental.rclass();
		String background = Background.background();
		String subrace = racial_stats(race);
		String name = Random_Name.naming(race, gender);
		
		try 
		{
			writer = new PrintWriter("Characters/"+name+".txt","UTF-8");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writer.println("Your Name is "+name);
		writer.println("You are a "+age+" year old " +gender +subrace + " "+rclass);
		writer.println("You are also a(n) " +background + Background.reason(background));
		writer.println(stats());
		writer.println();
		writer.println(Parents.parents(race));
		writer.println(Family.fullFamily());
		writer.println();
		writer.println("You have "+numsiblings+" siblings\r\n");
		writer.println(Family.childhood_Memories(CHA)+"\r\n");
		writer.println("You lived in a "+Family.lifestyle());
		writer.println();
		writer.println(life(age));
		for(int i = 1; i <= numsiblings; i++)
		{
			writer.println("Sibling "+i+": "+Sibling.sibling_stats(subrace, race)+"\r\n");
		}
		System.out.println(name);
		writer.close();
	}
	public static String life(int age)
	{
		int x = Roll.roll(100, 1);
		String y = "";
		int z = Roll.roll(100, 1);
		int rolls = 0;
		if(x <= 50)
		{
			if(age <= 20)
				rolls = 1;
			else if(age <= 30)
				rolls = Roll.roll(4, 1);
			else if(age <= 40)
				rolls = Roll.roll(6, 1);
			else if(age <= 50)
				rolls = Roll.roll(8,1);
			else if(age <= 60)
				rolls = Roll.roll(10,1);
			else
				rolls = Roll.roll(12,1);
		}
		else
		{
			if(z <= 20)
				rolls = 1;
			else if(z <= 59)
				rolls = Roll.roll(4, 1);
			else if(z <= 69)
				rolls = Roll.roll(6, 1);
			else if(z <= 89)
				rolls = Roll.roll(8,1);
			else if(z <= 99)
				rolls = Roll.roll(10,1);
			else
				rolls = Roll.roll(12,1);
		}
		for(int i = 0; i <= rolls; i++)
		{
			y += "Event "+(i+1)+":"+ Events.life_events()+"\r\n\r\n";
		}
		return y;
	}
	public static String stats()
	{
		int str = 0;
		int dex = 0;
		int con = 0;
		int in = 0;
		int wis = 0;
		int cha = 0;
		int tot = 0;
		String y = "";
		while(tot <= 72)
		{
			str = attribute();
			dex = attribute();
			con = attribute();
			in = attribute();
			wis = attribute();
			cha = attribute();
			tot = str + dex + con + in + wis + cha;
		}
		str = str + STR;
		dex = dex + DEX;
		con = con + CON;
		in = in + INT;
		wis = wis + WIS;
		cha = cha + CHA;
		y = "Str: " + str + "\r\nDex: "+ dex + "\r\nCon: "
				+ con + "\r\nInt: " + in + "\r\nWis: "+wis+"\r\nCha: "+cha;
		return y;

	}
	public static int attribute()
	{
		int[] x = new int[4];
		for(int i = 0; i < 4; i++)
			x[i] = Roll.roll(6, 1);
		Arrays.sort(x);
		int y = x[1] + x[2] + x[3];
		return y;
	}
	public static String racial_stats(String race) 
	{
		String x = race;
		int z = Roll.roll(100, 1);
		if (x == "Human")
		{
			STR = 1;
			DEX = 1;
			CON = 1;
			INT = 1;
			WIS = 1;
			CHA = 1;
		}
		else if(x == "Dwarf")
		{
			CON = 2;
			if(z <= 50)
			{
				x = "Hill Dwarf";
				WIS = 1;
			}
			else
			{
				x = "Mountian Dwarf";
				STR = 2;
			}
		}
		else if(x == "Elf")
		{
			DEX = 2;
			if(z == 100)
				z = Roll.roll(99,1);
			if(z <= 33)
			{
				x = "Wood Elf";
				WIS = 1;
			}
			else if(z <= 66)
			{
				x = "High Elf";
				INT = 1;
			}
			else 
			{
				x = "Dark Elf";
				CHA = 1;
			}
		}
		else if(x == "Halfling")
		{
			DEX = 2;
			if(z <= 50)
			{
				x = "Lightfoot Halfling";
				CHA = 1;
			}
			else
			{
				x = "Stout Halfling";
				CON = 1;
			}
		}
		else if(x == "Dragonborn")
		{
			STR = 2;
			CHA = 1;
			if(z <= 10)
				x = "Black";
			else if(z <= 20)
				x = "Blue";
			else if(z <= 30)
				x = "Brass";
			else if(z <= 40)
				x = "Bronze";
			else if(z <= 50)
				x = "Copper";
			else if(z <= 60)
				x = "Gold";
			else if(z <= 70)
				x = "Green";
			else if(z <= 80)
				x = "Red";
			else if(z <= 90)
				x = "Silver";
			else 
				x = "White";
			x += " Dragonborn";
		}
		else if(x == "Gnome")
		{
			INT = 2;
			if(z <= 50)
			{
				DEX = 2; 
				x = "Forest Gnome";
			}
			else
			{
				CON = 1;
				x = "Rock Gnome";
			}
			
		}
		else if(x == "Half-elf")
		{
			CHA = 2;
			for(int i = 0; i < 2; i++)
			{
				z = Roll.roll(5, 1);
				if(z == 1)
					STR = 1;
				else if(z == 2)
					DEX = 1;
				else if(z == 3)
					CON = 1;
				else if(z == 4)
					INT = 1;
				else
					WIS = 1;
			}
		}
		else if(x == "Half-orc")
		{
			STR = 2;
			CON = 1;
		}
		else if(x == "Tiefling")
		{
			INT = 1;
			CHA = 2;
		}
		return x;
	}

}
