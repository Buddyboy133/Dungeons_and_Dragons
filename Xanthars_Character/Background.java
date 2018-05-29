package Xanthars_Character;

public class Background {
	public static String background()
	{
		int x = Roll.roll(13,1);
		String y = "";
		if(x <= 1)
			y += "Acolyte";
		else if(x <= 2)
			y += "Charlatan";
		else if(x <= 3)
			y += "Criminal";
		else if(x <= 4)
			y += "Entertain";
		else if(x <= 5)
			y += "Folk Hero";
		else if(x <= 6)
			y += "Guild Artisan";
		else if(x <= 7)
			y += "Hermit";
		else if(x <= 8)
			y += "Noble";
		else if(x <= 9)
			y += "Outlander";
		else if(x <= 10)
			y += "Sage";
		else if(x <= 11)
			y += "Sailor";
		else if(x <= 12)
			y += "Soldier";
		else if(x <= 13)
			y += "Urchin";
		return y;
	}
	public static String reason(String z)
	{
		int x = Roll.roll(6, 1);
		String y = " because \"";
		if(z.equals("Acolyte"))
		{
			if(x <= 1)
				y += "I ran away from home at an early age and found refuge in a temple.";
			else if(x <= 2)
				y += "my family gave me to a temple, since they were un-able or \r\n\t"+
						"unwilling to care for me";
			else if(x <= 3)
				y += "I grew up in a household with strong religious convictions.\r\n\t" + 
						"Entering the service of one or more gods seemed natural.";
			else if(x <= 4)
				y += "an impassioned sermon struck a chord deep in my\r\n\t" + 
						"soul and moved me to serve the faith.";
			else if(x <= 5)
				y += "I followed a childhood friend, a respected acquaintance,\r\n\t" + 
						"or someone I loved into religious service.";
			else if(x <= 6)
				y += "after encountering a true servant of the gods, I was\r\n\t" + 
						"so inspired that I immediately entered the service\r\n\t" + 
						"of a religious group";
		}
		else if(z.equals("Charlatan"))
		{
			if(x <= 1)
				y += "I was left to my own devices, and my knack for manipulating\r\n\t" + 
						"others helped me survive.";
			else if(x <= 2)
				y += "I learned early on that people are gullible and easy\r\n\t" + 
						"to exploit.";
			else if(x <= 3)
				y += "I of ten got in trouble, but I managed to talk my way\r\n\t" + 
						"out of it every time.";
			else if(x <= 4)
				y += "I took up with a confidence artist, from whom I\r\n\t" + 
						"learned my craft";
			else if(x <= 5)
				y += "after a charlatan fleeced my family, I decided to\r\n\t" + 
						"learn the trade so I would never be fooled by such\r\n\t" + 
						"deception again.";
			else if(x <= 6)
				y += "I was poor or I feared becoming poor, sol learned\r\n\t" + 
						"the tricks I needed to keep myselfout of poverty.";
		}
		else if(z.equals("Criminal"))
		{
			if(x <= 1)
				y += "I resented authority in my younger days and saw a\r\n\t" + 
						"life of crime as the best way to fight against tyranny\r\n\t" + 
						"and oppression.";
			else if(x <= 2)
				y += "necessity forced me to take up the life, since it was\r\n\t" + 
						"the only way I could survive.";
			else if(x <= 3)
				y += "I fell in with a gang of reprobates and ne’er-dowells,\r\n\t" + 
						"and I learned my specialty from them.";
			else if(x <= 4)
				y += "a parent or relative taught me my criminal specialty\r\n\t" + 
						"to prepare me for the family business.";
			else if(x <= 5)
				y += "I left home and found a place in a thieves’ guild or\r\n\t" + 
						"some other criminal organization.";
			else if(x <= 6)
				y += "I was always bored, so I turned to crime to pass the\r\n\t" + 
						"time and discovered I was quite good at it";
		}
		else if(z.equals("Entertain"))
		{
			if(x <= 1)
				y += "members of my family made ends meet by performing,\r\n\t" + 
						"so it was fitting for me to follow their\r\n\t" + 
						"example.";
			else if(x <= 2)
				y += "I always had a keen insight into other people,\r\n\t" + 
						"enough so that I could make them laugh or cry\r\n\t" + 
						"with my stories or songs.";
			else if(x <= 3)
				y += "I ran away from home to follow a minstrel troupe.";
			else if(x <= 4)
				y += "I saw a bard perform once, and I knew from that\r\n\t" + 
						"moment on what I was born to do.";
			else if(x <= 5)
				y += "I earned coin by performing on street corners and\r\n\t" + 
						"eventually made a name for myself";
			else if(x <= 6)
				y += "a traveling entertainer took me in and taught me\r\n\t" + 
						"the trade.";
		}
		else if(z.equals("Folk Hero"))
		{
			if(x <= 1)
				y += "I learned what was right and wrong from my family.";
			else if(x <= 2)
				y += "I was always enamored by tales of heroes and\r\n\t" + 
						"wished I could be something more than ordinary.";
			else if(x <= 3)
				y += "I hated my mundane life, so when it was time for\r\n\t" + 
						"someone to step up and do the right thing, I took\r\n\t" + 
						"my chance.";
			else if(x <= 4)
				y += "a parent or one of my relatives was an adventurer,\r\n\t" + 
						"and I was inspired by that person’s courage.";
			else if(x <= 5)
				y += "a mad old hermit spoke a prophecy when I was\r\n\t" + 
						"born, saying that I would accomplish great things.";
			else if(x <= 6)
				y += "I have always stood up for those who are weaker\r\n\t" + 
						"than I am";
		}
		else if(z.equals("Guild Artisan"))
		{
			if(x <= 1)
				y += "I was apprenticed to a master who taught me the\r\n\t" + 
						"guild’s business.";
			else if(x <= 2)
				y += "I helped a guild artisan keep a secret or complete a\r\n\t" + 
						"task, and in return I was taken on as an apprentice.";
			else if(x <= 3)
				y += "one of my family members who belonged to the\r\n\t" + 
						"guild made a place for me";
			else if(x <= 4)
				y += "I was always good with my hands, so I took the opportunity\r\n\t" + 
						"to learn a trade.";
			else if(x <= 5)
				y += "I wanted to get away from my home situation and\r\n\t" + 
						"start a new life.";
			else if(x <= 6)
				y += "I learned the essentials of my craft from a mentor\r\n\t" + 
						"but had to join the guild to finish my training.";
		}
		else if(z.equals("Hermit"))
		{
			if(x <= 1)
				y += "my enemies ruined my reputation, and I fled to the\r\n\t" + 
						"wilds to avoid further disparagement.";
			else if(x <= 2)
				y += "I am comfortable with being isolated, as I seek\r\n\t" + 
						"inner peace";
			else if(x <= 3)
				y += "I never liked the people I called my friends,\r\n\t" +
						"so it was easy for me to strike out on my own.";
			else if(x <= 4)
				y += "I felt compelled to forsake my past, but did so with\r\n\t" + 
						"great reluctance, and sometimes I regret making\r\n\t" + 
						"that decision.";
			else if(x <= 5)
				y += "I lost everything—my home, my family, my friends.\r\n\t" + 
						"Going it alone was all I could do.";
			else if(x <= 6)
				y += "society's decadence disgusted me, so I decided to\r\n\t" + 
						"leave it behind.";
		}
		else if(z.equals("Noble"))
		{
			if(x <= 1)
				y += "I come from an old and storied family, and it fell to\r\n\t" + 
						"me to preserve the family name.";
			else if(x <= 2)
				y += "my family has been disgraced, and I intend to clear\r\n\t" + 
						"our name.";
			else if(x <= 3)
				y += "my family recently came by its title, and that elevation\r\n\t" + 
						"thrust us into a new and strange world.";
			else if(x <= 4)
				y += "my family has a title, but none of my ancestors\r\n\t" + 
						"have distinguished themselves since we gained it.";
			else if(x <= 5)
				y += "my family is filled with remarkable people. I hope\r\n\t" + 
						"to live up to their example.";
			else if(x <= 6)
				y += "I hope to increase my family’s power and influence.";
		}
		else if(z.equals("Outlander"))
		{
			if(x <= 1)
				y += "I spent a lot of time in the wilderness as a youngster,\r\n\t" + 
						"and I came to love that way of life.";
			else if(x <= 2)
				y += "from a young age, I couldn't abide the stink of the\r\n\t" + 
						"cities and preferred to spend my time in nature.";
			else if(x <= 3)
				y += "I came to understand the darkness that lurks in the\r\n\t" + 
						"wilds, and I vowed to combat it";
			else if(x <= 4)
				y += "my people lived on the edges of civilization, and i\r\n\t" + 
						"learned the methods of survival from my family.";
			else if(x <= 5)
				y += "after a tragedy I retreated to the wilderness, leaving\r\n\t" + 
						"my old life behind.";
			else if(x <= 6)
				y += "my family moved away from civilization, and I\r\n\t" + 
						"learned to adapt to my new environment.";
		}
		else if(z.equals("Sage"))
		{
			if(x <= 1)
				y += "I was naturally curious, so I packed up and went to\r\n\t" + 
						"a university to learn more about the world.";
			else if(x <= 2)
				y += "my mentor’s teachings opened my mind to new\r\n\t" + 
						"possibilities in that field of study.";
			else if(x <= 3)
				y += "I was always an avid reader, and I learned much\r\n\t" + 
						"I about my favorite topic on my own.";
			else if(x <= 4)
				y += "I discovered an old library and pored over the texts\r\n\t" + 
						"I found there. That experience awakened a hunger\r\n\t" + 
						"I for more knowledge.";
			else if(x <= 5)
				y += "I impressed a wizard who told me I was squandering\r\n\t" + 
						"my talents and should seek out an education to\r\n\t" + 
						"take advantage of my gifts.";
			else if(x <= 6)
				y += "one of my parents or a relative gave me a basic education\r\n\t" + 
						"that whetted my appetite, and I left home\r\n\t" + 
						"to build on what I had learned";
		}
		else if(z.equals("Sailor"))
		{
			if(x <= 1)
				y += "I was press-ganged by pirates and forced to serve\r\n\t" + 
						"on their ship until I finally escaped.";
			else if(x <= 2)
				y += "I wanted to see the world, so I signed on as a deckhand\r\n\t" + 
						"for a merchant ship.";
			else if(x <= 3)
				y += "one of my relatives was a sailor who took me to sea.";
			else if(x <= 4)
				y += "I needed to escape my community quickly, so I\r\n\t" + 
						"I stowed away on a ship. When the crew found me, |\r\n\t" + 
						"I was forced to work for my passage.";
			else if(x <= 5)
				y += "reavers attacked my community, so I found refuge\r\n\t" + 
						"on a ship until I could seek vengeance";
			else if(x <= 6)
				y += "I had few prospects where l was living, so I left to\r\n\t" + 
						"find my fortune elsewhere.";
		}
		else if(z.equals("Soldier"))
		{
			if(x <= 1)
				y += "I joined the militia to help protect my community\r\n\t" + 
						"from monsters.";
			else if(x <= 2)
				y += "a relative of mine was a soldier, and I wanted to\r\n\t" + 
						"carry on the family tradition.";
			else if(x <= 3)
				y += "the local lord forced me to enlist in the army";
			else if(x <= 4)
				y += "war ravaged my homeland while I was growing up.\r\n\t" + 
						"Fighting was the only life i ever knew";
			else if(x <= 5)
				y += "I wanted fame and fortune, so i joined a mercenary\r\n\t" + 
						"company, selling my sword to the highest bidder.";
			else if(x <= 6)
				y += "invaders attacked my homeland. It was my duty to\r\n\t" + 
						"take up arms in defense of my people";
		}
		else if(z.equals("Urchin"))
		{
			if(x <= 1)
				y += "monsters wiped out my village, and I was the sole\r\n\t" + 
						"survivor. I had to find a way to survive.";
			else if(x <= 2)
				y += "a notorious thieflooked after me and other orphans,\r\n\t"+ 
						"and we spied and stole to earn our keep";
			else if(x <= 3)
				y += "one day I woke up on the streets, alone and hungry,\r\n\t" + 
						"with no memory of my early childhood.";
			else if(x <= 4)
				y += "my parents died, leaving no one to look after me. I\r\n\t" + 
						"raised myself";
			else if(x <= 5)
				y += "wanderlust caused me to leave my family to see\r\n\t" + 
						"the world. I look after myself.";
			else if(x <= 6)
				y += "I ran away from a bad situation at home and made\r\n\t" + 
						"my own way in the world";
		}
		y+="\"";
		return y;
	}
}
