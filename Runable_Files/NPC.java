package Runable_Files;

import NPC.Apperance;
import Naming.Random_Name;
import Xanthars_Character.Supplemental;

public class NPC {

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
		System.out.println(age);
		System.out.println(Apperance.apperance());

	}

}
