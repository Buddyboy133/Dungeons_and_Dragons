package Xanthars_Character;

public class Events {
	public static String life_events()
	{
		int x = Roll.roll(100,1);
		int z = Roll.roll(6, 1);
		String y = "";
		if(x <= 10)
			y += "You suffered a tragedy: " + tragedies();
		else if(x <= 20)
			y += "You gained a bit of good fortune: " + boon();
		else if(x <= 30)
			y += "You fell in love or got married. If you get this result more than once, you can choose to have a child\r\n" + 
					"\tinstead. Work with your DM to determine the identity of your love interest.";
		else if(x <= 40)
		{
			y += "You made an enemy of an adventurer.";
			if(z == 1 || z == 3 || z == 5)
				y += " You are to blame for the rift.";
			else
				y+= " You are blameless.";
			y += "\n"+ Adventurer.adventurer();
		}
		else if(x <= 50)
		{
			y += "You made a friend of an adventurer.";
			y += "\n"+ Adventurer.adventurer();
		}
		else if(x <= 70)
			y += "You Spent time working in a job related to your\r\n" + 
					"\tbackground. Start the game with an extra " + Roll.roll(6, 2) + " gp.";
		else if(x <= 75)
			y += "You met someone important.";
		else if(x <= 80)
			y += "You went on an adventure: "+ adventures();
		else if(x <= 85)
			y += "You had a supernatural experience: " + supernatural();
		else if(x <= 90)
			y += "You fought in a battle: " + war();
		else if(x <= 95)
			y += "You committed a crime or were wrongly accused of \r\n" + 
					"\tdoing so: " + crime() + "\n" + punishment();
		else if(x <= 99)
			y += "You encountered something magical: " + arcane();
		else
			y += "Something truly strange happened to you:" + weird();
		return y;
	}
	public static String adventures()
	{
		int x = Roll.roll(100,1);
		String y = "";
		if(x <= 10)
			y += "You nearly died. You have nasty scars on your\r\n" + 
					"\tbody, and you are missing an ear, "+ Roll.roll(3, 1) + " fingers, or\r\n\t" + 
					+Roll.roll(4, 1) + " toes";
		else if(x <= 20)
			y += "You suffered a grievous injury. Although the wound\r\n" + 
					"\thealed, it still pains you from time to time";
		else if(x <= 30)
			y += "You were wounded, but in time you fully recovered";
		else if(x <= 40)
			y += "You contracted a disease while exploring a filthy\r\n" + 
					"\twarren. You recovered from the disease, but you\r\n" + 
					"\thave a persistent cough, pockmarks on your skin, or prematurely gray hair";
		else if(x <= 50)
			y += "You were poisoned by a trap or a monster. You re- covered, but the next time you must make a saving\r\n" + 
					"\tthrow against poison, you make the saving throw\r\n" + 
					"\twith disadvantage.";
		else if(x <= 60)
			y += "You lost something of sentimental value to you\r\n" + 
					"\tduring your adventure. Remove one trinket from\r\n" + 
					"\tyour possessions";
		else if(x <= 70)
			y += "You were terribly frightened by something you en—\r\n" + 
					"\tcountered and ran away, abandoning your companions\r\n" + 
					"\tto their fate.";
		else if(x <= 80)
			y += "You learned a great deal during your adventure.\r\n" + 
					"\tThe next time you make an ability check or a saving\r\n" + 
					"\tthrow, you have advantage on the roll.";
		else if(x <= 90)
			y += "You found some treasure on your adventure. You\r\n" + 
					"\thave "+ Roll.roll(6, 2) +" gp left from your share of it.";
		else if(x <= 99)
			y += "You found a considerable amount of treasure on your adventure. You have "+(Roll.roll(20, 1)+50)+" gp left from\r\n" + 
					"\tyour share of it.";
		else 
			y += "You came across a common magic item (of the DM’s Choice)";	
		return y;
	}
	public static String arcane()
	{
		int x = Roll.roll(10,1);
		String y = "";
		if(x <= 1)
			y += "You were charmed or frightened by a spell.";
		else if(x <= 2)
			y += "You were injured by the effect of a spell.";
		else if(x <= 3)
			y += "You witnessed a powerful spell being cast by a\r\n" + 
					"\ncleric, a druid, a sorcerer, a warlock, or a wizard";
		else if(x <= 4)
			y += "You drank a potion (of the DM's choice).";
		else if(x <= 5)
			y += "You found a spell scroll (of the DM's choice) and\r\n" + 
					"\nsucceeded in casting the Spell it contained.";
		else if(x <= 6)
			y += "You were affected by teleportation magic.";
		else if(x <= 7)
			y += "You turned invisible for a time.";
		else if(x <= 8)
			y += "You identified an illusion for what it was.";
		else if(x <= 9)
			y += "You saw a creature being conjured by magic.";
		else 
		{
			y += "Your fortune was read by a diviner. They saw either \n" +life_events()+ "\nOr"+ life_events()+"\n(Which one of may or may not come true).";
		}	
		return y;
	}
	public static String boon()
	{
		int x = Roll.roll(10,1);
		String y = "";
		if(x <= 1)
			y += "A friendly wizard gave you a spell scroll containing\r\n" + 
					"\tone cantrip (of the DM's choice).";
		else if(x <= 2)
			y += "You saved the life of a commoner, who now owes\r\n" + 
					"\tyou a life debt. This individual accompanies you on\r\n" + 
					"\tyour travels and performs mundane tasks for you,\r\n" + 
					"\tbut will leave if neglected, abused, or imperiled.\r\n" + 
					"\tDetermine details about this character by using the\r\n" + 
					"\tsupplemental tables and working with your DM.";
		else if(x <= 3)
			y += "You found a riding horse.";
		else if(x <= 4)
			y += "You found some money. You have "+Roll.roll(20, 1) +" gp in addition to your regular starting funds.";
		else if(x <= 5)
			y += "A relative bequeathed you a simple weapon of your\r\n" + 
					"\tchoice.";
		else if(x <= 6)
			y += "You found something interesting. You gain one\r\n" + 
					"\tadditional trinket";
		else if(x <= 7)
			y += "You once performed a service for a local temple.\r\n" + 
					"\tThe next time you visit the temple, you can receive\r\n" + 
					"\thealing up to your hit point maximum";
		else if(x <= 8)
			y += "A friendly alchemist gifted you with a potion of \r\n" + 
					"\thealing or a flask of acid, as you choose";
		else if(x <= 9)
			y += "You found a treasure map.";
		else
			y += "A distant relative left you a stipend that enables\r\n" + 
					"\tyou to live at the comfortable lifestyle for "+Roll.roll(20,1)+
					"\tyears. If you choose to live at a higher lifestyle, you\r\n" + 
					"\treduce the price of the lifestyle by 2 gp during that\r\n" + 
					"\ttime period.";
		return y;
	}
	public static String crime()
	{
		int x = Roll.roll(8,1);
		String y = "";
		if(x <= 1)
			y += "Murder";
		else if(x <= 2)
			y += "Theft";
		else if(x <= 3)
			y += "Burglary";
		else if(x <= 4)
			y += "Assault";
		else if(x <= 5)
			y += "Smuggling";
		else if(x <= 6)
			y += "Kidnapping";
		else if(x <= 7)
			y += "Extortion";
		else 
			y += "Counterfeiting";
		return y;
	}
	public static String punishment()
	{
		int x = Roll.roll(12,1);
		String y = "\r\n\tPunishiment: ";
		if(x <= 3)
			y += "You did not commit the crime and were exonerated\r\n" + 
					"\tafter being accused.";
		else if(x <= 6)
			y += "You committed the crime or helped do so, but\r\n" + 
					"\tnonetheless the authorities found you not guilty";
		else if(x <= 8)
			y += "You were nearly caught in the act. You had to flee\r\n" + 
					"\tand are wanted in the community where the crime\r\n" + 
					"\toccurred";
		else
			y += "You were caught and convicted. You spent time in\r\n" + 
					"\tjail, chained to an oar, or performing hard labor.\r\n" + 
					"\tYou served a sentence of "+ Roll.roll(4,1)+" years or succeeded in\r\n" + 
					"\tescaping after that much time.";	
		return y;
	}
	public static String supernatural()
	{
		int x = Roll.roll(100,1);
		int z = 0;
		String y = "";
		if(x <= 5)
			y += "You were ensorcelled by a fey and enslaved for"+Roll.roll(6, 1)+" \r\n" + 
					"\tyears before you escaped.";
		else if(x <= 10)
			y += "You saw a demon and ran away before it could do\r\n" + 
					"\tanything to you.";
		else if(x <= 15)
			y += "A devil tempted you. Make a DC 10 Wisdom saving\r\n" + 
					"\tthrow. On a failed save, your alignment shifts one\r\n" + 
					"\tstep toward evil (if it‘s not evil already), and you\r\n" + 
					"\tstart the game with an additional "+(Roll.roll(20,1)+50) +" gp.";
		else if(x <= 20)
			y += "You woke up one morning miles from your home,\r\n" + 
					"\twith no idea how you got there.";
		else if(x <= 30)
			y += "You visited a holy site and felt the presence of the\r\n" + 
					"\tdivine there.";
		else if(x <= 40)
			y += "You witnessed a falling red star, a face appearing in\r\n" + 
					"\tthe frost, or some other bizarre happening.";
		else if(x <= 50)
			y += "You escaped certain death and believe it was the\r\n" + 
					"\tintervention of a god that saved you.";
		else if(x <= 60)
			y += "You witnessed a minor miracle.";
		else if(x <= 70)
			y += "You explored an empty house and found it to be\r\n" + 
					"\thaunted.";
		else if(x <= 75)
		{
			y += "You were briefly possessed, by a(n) ";
			z = Roll.roll(6, 1);
			if(z <= 1)
				y += "celestial"; 
			else if(z <= 2)
				y += "devil";
			else if(z <= 3)
				y += "demon";
			else if(z <= 4)
				y += "fey";
			else if(z <= 5)
				y += "elemental";
			else
				y += "undead";
		}
		else if(x <= 80)
			y += "You saw a ghost.";
		else if(x <= 85)
			y += "You saw a ghoul feeding on a corpse.";
		else if(x <= 90)
			y += "A celestial or a fiend visited you in your dreams to\r\n" + 
					"\tgive a warning of dangers to come.";
		else if(x <= 95)
			y += "You briefly visited the Feywild or the Shadowfell.";
		else  
			y += "You saw a portal that you believe leads to another\r\n" + 
					"\tplane of existence.";
		return y;
	}
	public static String tragedies()
	{
		int x = Roll.roll(12,1);
		String y = "";
		if(x <= 2)
			y += "A family member or a close friend died: "+ Supplemental.death();
		else if(x <= 3)
			y += "A friendship ended bitterly, and the other person\r\n" + 
					"\tis now hostile to you. The cause might have been a misunderstanding or something you or the former\r\n" + 
					"\tfriend did.";
		else if(x <= 4)
			y += "You lost all your possessions in a disaster, and you\r\n" + 
					"\thad to rebuild your life.";
		else if(x <= 5)
			y += "You were imprisoned for a crime you didn’t commit\r\n" + 
					"\tand spent "+ Roll.roll(6, 1)+" years at hard labor, in jail, or\r\n" + 
					"\tshackled to an oar in a slave galley.";
		else if(x <= 6)
			y += "War ravaged your home community, reducing everything\r\n" + 
					"\tto rubble and ruin. in the aftermath, you\r\n" + 
					"\teither helped your town rebuild or moved somewhere\r\n" + 
					"\telse.";
		else if(x <= 7)
			y += "A lover disappeared without a trace. You have been\r\n" + 
					"\tlooking for that person ever since.";
		else if(x <= 8)
			y += "A terrible blight in your home community caused\r\n" + 
					"\tcrops to fail, and many starved. You lost a sibling\r\n" + 
					"\tor some other family member.";
		else if(x <= 9)
			y += "You did something that brought terrible shame to\r\n" + 
					"\tyou in the eyes of your family. You might have been\r\n" + 
					"\tinvolved in a scandal, dabbled in dark magic, or of fended someone important. The attitude of your\r\n" + 
					"\tfamily members toward you becomes indifferent at\r\n" + 
					"\tbest, though they might eventually forgive you.";
		else if(x <= 10)
			y += "For a reason you were never told, you were exiled\r\n" + 
					"\tfrom your community. You then either wandered in\r\n" + 
					"\tthe wilderness for a time or promptly found a new\r\n" + 
					"\tplace to live.";
		else if(x <= 11)
		{
			y += "A romantic relationship ended,";
			if(Roll.roll(6, 1) <= 3)
			{
				y += " with bad feelings.";
			}
			else
			{
				y += " amicably.";
			}
		}
		else
		{	
			y += "A current or prospective romantic partner of yours\r\n" + 
					"\tdied. They were ";
			String h = Supplemental.death();
			y += h;
			if(h == "Murdered")
			{
				if(Roll.roll(12, 1) == 1)
				{
					y += " by you, directly or indirectly";
				}
			}
		}	
		return y;
	}
	public static String war()
	{
		int x = Roll.roll(12,1);
		String y = "You were knocked out and left for dead. You woke\r\n" + 
					"\tup hours later with no recollection of the battle.";
		if(x <= 1)
			y += "You were knocked out and left for dead. You woke\r\n" + 
					"\tup hours later with no recollection of the battle";
		else if(x <= 3)
			y += "You were badly injured in the fight, and you still\r\n" + 
					"\tbear the awful scars of those wounds.";
		else if(x <= 4)
			y += "You ran away from the battle to save your life, but\r\n" + 
					"\tyou still feel shame for your cowardice.";
		else if(x <= 7)
			y += "You suffered only minor injuries, and the wounds\r\n" + 
					"\tall healed without leaving scars.";
		else if(x <= 9)
			y += "You survived the battle, but you suffer from terrible\r\n" + 
					"\tnightmares in which you relive the experience.";
		else if(x <= 12)
			y += "You escaped the battle unscathed, though many of \r\n" + 
					"\tyour Friends were injured or lost";
		else
			y += "You acquitted yourselfwell in battle and are re—\r\n" + 
					"\tmembered as a hero. You might have received a\r\n" + 
					"\tmedal for your bravery";	
		return y;
	}
	public static String weird()
	{
		int x = Roll.roll(12,1);
		String y = "";
		if(x <= 1)
			y += "You were turned into a toad and remained in that\r\n" + 
					"\tform for "+ Roll.roll(4, 1)+" weeks";
		else if(x <= 2)
			y += "You were petrified and remained a stone statue for\r\n" + 
					"\ta time until someone freed you.";
		else if(x <= 3)
			y += "You were enslaved by a hag, a satyr, or some other\r\n" + 
					"\tbeing and lived in that creature’s thrall for "+ Roll.roll(6, 1)+"\r\n" + 
					"\tyears.";
		else if(x <= 4)
			y += "A dragon held you as a prisoner for "+Roll.roll(4, 1)+" months\r\n" + 
					"\tuntil adventurers killed it";
		else if(x <= 5)
			y += "You were taken captive by a race of evil humanoids\r\n" + 
					"\tsuch as drow, kuo-toa, or quaggoths. You lived as a\r\n" + 
					"\tslave in the Underdark until you escaped.";
		else if(x <= 6)
			y += "You served a powerful adventurer as a hireling. You\r\n" + 
					"\thave only recently left that service. Use the supplemental\r\n" + 
					"\ttables and work with your DM to determine\r\n" + 
					"\tthe basic details about your former employer";
		else if(x <= 7)
			y += "You went insane for "+Roll.roll(6, 1)+" years and recently re- gained your sanity. A tic or some other bit of odd\r\n" + 
					"\tbehavior might linger";
		else if(x <= 8)
			y += "A lover of yours was secretly a silver dragon.";
		else if(x <= 9)
			y += "You were captured by a cult and nearly sacrificed\r\n" + 
					"\ton an altarto the foul being the cultists served.\r\n" + 
					"\tYou escaped, but you fear they will find you.";
		else if(x <= 10)
			y += "You met a demigod, an archdevil, an archfey, a demon\r\n" + 
					"\tlord, or a titan, and you lived to tell the tale.";
		else if(x <= 11)
			y += "You were swallowed by a giant fish and spent a\r\n" + 
					"\tmonth in its gullet before you escaped.";
		else  
			y += "A powerful being granted you a wish, but you\r\n" + 
					"\tsquandered it on something frivolous.";	
		return y;
	}
}
