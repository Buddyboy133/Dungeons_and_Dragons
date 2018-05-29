package NPC;

import java.util.Random;

public class Random_NPC {

	public static void main(String[] args) {
		String alignment = Alignment.alignment();//done
		System.out.println(Race.race());//done
		System.out.println(Age.age());
		System.out.println(Class.genclass());
		System.out.println(alignment);//done
		System.out.println(Apperance.apperance());//done
		System.out.println(Abilities.abilities());//done
		System.out.println(Talents.talents());//done
		System.out.println(Mannerisms.mannerisms());//done
		System.out.println(Interactions.interactions());//done
		System.out.println(Bonds.bonds());//done
		System.out.println(Ideals.ideals(alignment));//
		System.out.println(Flaws.flaws());//done
		

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
