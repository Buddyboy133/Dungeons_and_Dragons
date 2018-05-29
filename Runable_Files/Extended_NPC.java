package Runable_Files;

import NPC.*;
import Naming.Random_Name;
import Xanthars_Character.Supplemental;

public class Extended_NPC {
	
	public static void main(String[] args) {
		String race = Supplemental.race();
		int age = Supplemental.age(race);
		String gender = Supplemental.gender();
		String rclass = Supplemental.rclass();
		String name = Random_Name.naming(race, gender);
		String alignment = Supplemental.alignment();
		System.out.println(name);
		System.out.println(gender + race);
		System.out.println(rclass);
		System.out.println(alignment);
		System.out.println("Age: " + age);
		
		System.out.println(Apperance.apperance());//done
		System.out.println(Abilities.abilities());//done
		System.out.println(Talents.talents());//done
		System.out.println(Mannerisms.mannerisms());//done
		System.out.println(Interactions.interactions());//done
		System.out.println(Bonds.bonds());//done
		System.out.println(Ideals.ideals(alignment));//
		System.out.println(Flaws.flaws());//done
		
	}
}
