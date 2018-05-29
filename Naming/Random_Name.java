package Naming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Random_Name {

	public static void main(String[] args) 
	{
		String name = naming("Dragonborn","Male");
		System.out.println(name);
	}
	public static String naming(String race, String gender)
	{
		String y = "";
		race = race.replace(" ", "");
		gender = gender.replace(" ", "");
		if(race.equals("Half-elf"))
		{
			if(Roll.roll(100, 1)<= 50)
				race = "Elf";
			else
				race = "Human";
		}
		if(race.equals("Human"))
			race = humanConversion();
		y += firstName(race, gender);
		if(race.equals("Dragonborn") || race.equals("Dwarf") || race.equals("Gnome"))
		{
			y += clanName(race);
		}
		else if(race.equals("Elf")|| race.equals("Halfling"))
		{
			y+= familyName(race);
		}
		return y;
	}
	public static String humanConversion()
	{
		int x = Roll.roll(17, 1);
		String y ="";
		if(x == 1)
			y = "Arabic";
		else if(x == 2)
			y = "Celtic";
		else if(x == 3)
			y = "Chinese";
		else if(x == 4)
			y = "Egyptian";
		else if(x == 5)
			y = "English";
		else if(x == 6)
			y = "French";
		else if(x == 7)
			y = "German";
		else if(x == 8)
			y = "Greek";
		else if(x == 9)
			y = "Indian";
		else if(x == 10)
			y = "Japanese";
		else if(x == 11)
			y = "Mesoamerican";
		else if(x == 12)
			y = "NigerCongo";
		else if(x == 13)
			y = "Norse";
		else if(x == 14)
			y = "Polynesian";
		else if(x == 15)
			y = "Roman";
		else if(x == 16)
			y = "Slavic";
		else
			y = "Spanish";
		return y;
	}
	public static String firstName(String race, String gender)
	{
		if(race.equals("Half-elf"))
		{
			if(Roll.roll(100, 1)<= 50)
				race = "Elf";
			else
				race = "Human";
		}
		if(race.equals("Human"))
			race = humanConversion();
		race = race.replace(" ", "");
		gender = gender.replace(" ", "");
		String x = "Names/"+race+"/"+gender+".txt";
		String[] y = nameGet(x);
		int i = Roll.roll(y.length-1, 1);
		y[i].replace(" ", "");
		return y[i];
	}
	public static String clanName(String race)
	{
		race = race.replace(" ", "");
		String x = "Names/"+race+"/"+"Clan.txt";
		String[] y = nameGet(x);
		int i = Roll.roll((y.length-1), 1);
		y[i].replace(" ", "");
		return " of the "+y[i]+" Clan";
	}
	public static String familyName(String race)
	{
		race = race.replace(" ", "");
		String x = "Names/"+race+"/"+"Family.txt";
		String[] y = nameGet(x);
		int i = Roll.roll(y.length-1, 1);
		y[i].replaceAll(" ", "");
		return " " + y[i];
	}
	public static String[] nameGet(String txt)
	{
		String y = "";
		String name[] = null;
		y = txt;
		try {
			File file = new File(y);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			String name1[] = (stringBuffer.toString()).split("\n");
			name = name1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
}
