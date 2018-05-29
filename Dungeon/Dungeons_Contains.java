package Dungeon;

import java.util.Random;
import java.util.Scanner;
public class Dungeons_Contains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int z = 0;
		int x = 0;
		while(z != -1)
		{
		System.out.println("Choose a path: Whole Room(0), Trick(1), Trap(2), Obstical(3), Treasure(4) Quit(-1)");
		z = input.nextInt();
		x = 0;
		if(z == 0)
		{
		String y = "";
		x = setter();
		contains(x);
		if(x == 6 || x == 12)
			hazard();
		if(x == 8 || x == 9)
			trap();
		if(x == 7)
			obstical();
		if(x == 10)
			trick();
		}
		else if(z == 1)
			trick();
		else if(z == 2)
			trap();
		else if(z == 3)
			obstical();
		else if(z == 4)
			Treasure.newtreasure();
		}
	}
	private static void trick() {
		int x = roll(20,1);
		int z = roll(100,1);
		String r = "resistance";
		String y ="";
		if (x <= 1)
			y = "Book";
		else if(x <= 2)
			y = "Brain preserved in jar";
		else if(x <= 3)
			y = "Burning fire";
		else if(x <= 4)
			y = "Cracked gem";
		else if(x <= 5)
			y = "Door";
		else if(x <= 6)
			y = "Fresco";
		else if(x <= 7)
			y = "Furniture";
		else if(x <= 8)
			y = "Glass sculpture";
		else if(x <= 9)
			y = "Mushroom field";
		else if(x <= 10)
			y = "Painting";
		else if(x <= 11)
			y = "Plant or tree";
		else if(x <= 12)
			y = "Pool of water";
		else if(x <= 13)
			y = "Runes engraved on wall or floor";
		else if(x <= 14)
			y = "Skull";
		else if(x <= 15)
			y = "Sphere of magical energy";
		else if(x <= 16)
			y = "Statue";
		else if(x <= 17)
			y = "Stone obelisk";
		else if(x <= 18)
			y = "Suit of armor";
		else if(x <= 19)
			y = "Tapestry or rug";
		else if(x <= 20)
			y = "Target dummy";
		System.out.println("Object:"+y);
		x = roll(100,1);
		y ="";
		if (x <= 3)
			y = "Ages the first person to touch the object";
		else if(x <= 6)
			y = "The touched object animates, or it animates other objects nearby";
		else if(x <= 10)
			y = "Asks three skill-testing questions (if all three are answered correctly, a reward appears) ";
		else if(x <= 13)
		{
			if(z <= 50)
				r = "vulnerablilty";
			y = "Bestows " + r;
		}
		else if(x <= 16)
		{
			if (z <= 25)
				r = "alignment";
			else if(z <= 50)
				r = "personality";
			else if(z <= 75)
				r = "apperance";
			else
				r = "gender";
			y = "Changes a character's "+r+" when touched";
		}
		else if(x <= 19)
			y = "Changes one substance to another, such as gold to lead or metal to brittle crystal ";
		else if(x <= 22)
			y = "Creates a force field";
		else if(x <= 26)
			y = "Creates an illusion";
		else if(x <= 29)
			y = "Suppresses magic items for a time";
		else if(x <= 32)
		{
			if(z<= 50)
				r = "enlarges";
			else
				r = "reduces";
			y = r + "characters";
		}
		else if(x <= 35)
			y = "Magic mouth speaks a riddle";
		else if(x <= 38)
			y = "Confusion (targets all creatures within 10ft.)";
		else if(x <= 41)
		{
			if(z<= 50)
				r = "true)";
			else
				r = "false)";
			y = "Gives directions (" + r;
		}
		else if(x <= 44)
			y = "Grants a wish";
		else if(x <= 47)
			y = "Flies about to avoid being touched";
		else if(x <= 50)
			y = "Casts geas on the characters";
		else if(x <= 53)
			{
			if(z<= 25)
				r = "Increases";
			else if (z <= 50)
				r = "Reduces";
			else if (z <= 75)
				r = "Negates";
			else
				r = "Reverses";
			y = r + " gravity";
			}
		else if(x <= 56)
			y = "Induces greed";
		else if(x <= 59)
			y = "Contains an imprisoned creature";
		else if(x <= 62)
			y = "Locks or unlocks exits";
		else if(x <= 65)
			y = "Offers a game of chance, with the promise of a reward or valuable information";
		else if(x <= 68)
		{
			if(z<= 50)
				r = "helps";
			else
				r = "harms";
			y = r + " certian types of creatures";
		}
		else if(x <= 71)
			y = "Casts polymorph on the characters (lasts 1 hour)";
		else if(x <= 75)
			y = "Presents a puzzle or riddle";
		else if(x <= 78)
			y = "Prevents movement ";
		else if(x <= 81)
		{
			if(z<= 17)
				r = "coins";
			else if (z <= 33)
				r = "false coins";
			else if (z <= 50)
				r = "gems";
			else if (z <= 66)
				r = "false gems";
			else if (z <= 83)
				r = "magic item";
			else
				r = "map";
			y = "Releases "+r;
		}
		else if(x <= 84)
		{
			if(z<= 33)
				r = "Relases";
			else if (z <= 66)
				r = "Summons";
			else 
				r = "Turns into";
			y = r + " a montser";
		}
		else if(x <= 87)
			y = "Casts suggestion on the characters";
		else if(x <= 90)
			y = "Wails loudly when touched";
		else if(x <= 93)
		{
			if(z<= 17)
				r = "normal speech";
			else if (z <= 33)
				r = "nonsense";
			else if (z <= 50)
				r = "poetry and rhymes";
			else if (z <= 66)
				r = "singing";
			else if (z <= 83)
				r = "spellcasting";
			else
				r = "screaming";
			y = "Talks(" + r + ")";
		}
		else if(x <= 97)
			y = "Teleports characters to another place";
		else if(x <= 100)
			y = "Swaps two or more characters' minds";
		System.out.println(y);
	}
	private static void obstical() {
		int x = roll(20,1);
		int z = roll(100,1);
		boolean h = false;
		String y ="";
		if (x <= 1)
			y = "Antilife aura with a radius of 1d10 x 10ft, while in the aura living creatures can't regain hit points ";
		else if(x <= 2)
			y = "Battering winds reduce speed by half, impose\r disadvantage on ranged attack rolls";
		else if(x <= 3)
			y = "Blade barrier blocks passage";
		else if(x <= 8)
			y = "Cave-in";
		else if(x <= 12)
			y = "Chasm 1d4 x 10ft. wide and 2d6 x 10ft. deep, possibly conneced to other levels of the dungeon";
		else if(x <= 14)
			y = "Flooding leaves 2d10 ft. of water in the area; create nearby upward-sloping passages, raised floors, or rising stairs to contain the water";
		else if(x <= 15)
			y = "Lava flows through the area";
			if(z<=50)
				y += " with a stone bridge";
		else if(x <= 16)
			y = "Overgrown mushrooms block progress and must be hacked down";
			if(z<= 25)
			{
				y += " with a hazard hidden";
				h = true;
			}
		else if(x <= 17)
			y = "Poisonous gas (deals 1d6 poison damage per minute of exposure)";
		else if(x <= 18)
			y = "Reverse gravity effect causes creatures to fall toward the ceiling";
		else if(x <= 19)
			y = "Wall of fire blocks passage";
		else if(x <= 20)
			y = "Wall of force blocks passage";
		System.out.println(y);
		if(h == true)
			hazard();
	}
	public static int setter()
	{
		int x = roll(100,1);
		int y = -1;
		if (x <= 8)
			y = 0;//"Monster (dominant inhabitant)";
		else if(x <= 15)
			y = 1;//"Monster (dominant inhabitant) with treasure";
		else if(x <= 27)
			y = 2;//"Monster (pet or allied creature)";
		else if(x <= 33)
			y = 3;//"Monster (pet or allied creature) guarding treasure";
		else if(x <= 42)
			y = 4;//"Monster (random creature)";
		else if(x <= 50)
			y = 5;//"Monster (random creature) with treasure";
		else if(x <= 58)
			y = 6;//"Dungeon hazard (see \"Random Dungeon\r\n" + 
					//"Hazards\") with incidental treasure";
		else if(x <= 63)
			y = 7;//"Obstacle (see \"Random Obstacles\")";
		else if(x <= 73)
			y = 8;//"Trap (see \"Random Traps\")";
		else if(x <= 76)
			y = 9;//"Trap (see \"Random Traps\") protecting treasure";
		else if(x <= 80)
			y = 10;//"Trick (see \"Random Tricks\")";
		else if(x <= 88)
			y = 11;//"Empty room ";
		else if(x <= 94)
			y = 12;//"Empty room with dungeon hazard (see \"Random\r\n" + 
					//"Dungeon Hazards \")";
		else if(x <= 100)
			y = 13;//"Empty room with treasure";
		return y;
	}
	
	public static void hazard()
	{
		int x = roll(20,1);
		String y ="";
		if (x <= 3)
			y = "Brown mold";
		else if(x <= 8)
			y = "Green slime";
		else if(x <= 10)
			y = "Shrieker";
		else if(x <= 15)
			y = "Spiderwebs";
		else if(x <= 17)
			y = "Violet fungus";
		else if(x <= 20)
			y = "Yellow mold";
		System.out.println(y);
	}
	public static void trap()
	{
		int x = roll(6,1);
		String y ="";
		if (x <= 2)
			y = "Setback";
		else if(x <= 5)
			y = "Dangerous";
		else if(x <= 6)
			y = "Deadly";
		x = roll(6,1);
		System.out.println(y);
		if(x <= 1)
			y = "Stepped on (floor, stairs)";
		else if(x <= 2)
			y = "Moved through (doorway, hallway)";
		else if(x <= 3)
			y = "Touched (doorknob, statue)";
		else if(x <= 4)
			y = "Opened (door, treasure chest)";
		else if(x <= 5)
			y = "Looked at (mural, arcane symbol) ";
		else if(x <= 6)
			y = "Moved (cart, stone block)";
		y = "Triggered type: "+y;
		System.out.println(y);
	}
	
	public static void contains(int x)
	{
		String y ="";
		if (x <= 0)
			y = "Monster (dominant inhabitant)";
		else if(x <= 1)
			y = "Monster (dominant inhabitant) with treasure";
		else if(x <= 2)
			y = "Monster (pet or allied creature)";
		else if(x <= 3)
			y = "Monster (pet or allied creature) guarding treasure";
		else if(x <= 4)
			y = "Monster (random creature)";
		else if(x <= 5)
			y = "Monster (random creature) with treasure";
		else if(x <= 6)
			y = "Dungeon hazard (see \"Random Dungeon\r\n" + 
					"Hazards\") with incidental treasure";
		else if(x <= 7)
			y = "Obstacle (see \"Random Obstacles\")";
		else if(x <= 8)
			y = "Trap (see \"Random Traps\")";
		else if(x <= 9)
			y = "Trap (see \"Random Traps\") protecting treasure";
		else if(x <= 10)
			y = "Trick (see \"Random Tricks\")";
		else if(x <= 11)
			y = "Empty room ";
		else if(x <= 12)
			y = "Empty room with dungeon hazard (see \"Random\r\n" + 
					"Dungeon Hazards \")";
		else if(x <= 13)
			y = "Empty room with treasure";
		System.out.println(y);
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
