package Xanthars_Character;

public class Family {
	
	public static String fullFamily()
	{
		int x = Roll.roll(100,1);
		String y = "You were raised in/by: ";
		if(x <= 1)
			y += "None";
		else if(x <= 2)
			y += "Institution, such as an asylum";
		else if(x <= 3)
			y += "Temple";
		else if(x <= 5)
			y += "Orphanage";
		else if(x <= 7)
			y += "Guardian";
		else if(x <= 15)
			y += "Paternal or maternal aunt, uncle, or both; or extended family such as a tribe or clan";
		else if(x <= 25)
			y += "Paternal or maternal grandparent(s)";
		else if(x <= 35) 
			y += "Adoptive family (same or different race) " + "("+Supplemental.race()+")";
		else if(x <= 55)
			y += "Single father or stepfather";
		else if(x <= 75)
			y += "Single mother or stepmother";
		else 
			y += "Mother and father";
		if(x <= 35)
		{
			y += "\r\nYour Mother"+absent_Parent();
			y += "\r\nYour Father"+absent_Parent();
		}
		else if(x <= 55)
		{
			y += "\r\nYour Mother"+absent_Parent();
			y += "\r\nYour birth Father(for step fathers)"+absent_Parent();
		}
		else if(x <= 75)
		{
			y += "\r\nYour birth Mother(for step mothers)"+absent_Parent();
			y += "\r\nYour Father"+absent_Parent();
		}
		return y;
	}
	public static String absent_Parent()
	{
		int x = Roll.roll(4,1);
		String y = "";
		if(x <= 1)
			y = " died " + Supplemental.death();
		else if(x <= 2)
			y = " was imprisoned, enslaved, or otherwise taken away.";
		else if(x <= 3)
			y = " abandoned you.";
		else
			y = " disappeared to an unknown fate.";
		return y;
	}
	public static String lifestyle()
	{
		int x = Roll.roll(6,3);
		int z = 0;
		String y = "";
		if(x <= 3)
		{
			y += "Wretched";
			z = -40;
		}
		else if(x <= 5)
		{
			y += "Squalid";
			z = -20;
		}
		else if(x <= 8)
		{
			y += "Poor";
			z = -10;
		}
		else if(x <= 12)
		{
			y += "Modest";
		}
		else if(x <= 15)
		{
			y += "Comfortable";
			z = 10;
		}
		else if(x <= 17)
		{
			y += "Wealthy";
			z = 20;
		}
		else 
		{
			y += "Aristocratic";
			z = 40;
		}
		y +=" lifestyle";
		y += home(z);
		return y;
	}
	public static String home(int z)
	{
		int x = Roll.roll(100, 1) + z;
		String y = " and you lived ";
		if(x <= 0)
			y += "on the streets";
		else if(x <= 20)
			y += "in a rundown shack";
		else if(x <= 30)
			y += "in no permanent residence; you moved around a lot";
		else if(x <= 40)
			y += "in an encampment or village in the wilderness";
		else if(x <= 50)
			y += "in an apartment in a rundown neighborhood";
		else if(x <= 70)
			y += "in a small house";
		else if(x <= 90)
			y += "in a large house";
		else if(x <= 110)
			y += "in a mansion";
		else
			y += "in a palace or castle";
		return y;
	}
	public static String childhood_Memories(int CHA)
	{
		int cha = CHA;
		if(cha >= 10)
		{
			cha = cha - 10;
			if(cha % 2 == 0)
				cha = cha/2;
			else
				cha = (cha-1)/2;
		}
		else if(cha == 9 || cha == 8)
			cha = -1;
		else if(cha == 7 || cha == 6)
			cha = -2;
		else if(cha == 5 || cha == 4)
			cha = -3;
		else if(cha == 3 || cha == 2)
			cha = -4;
		else
			cha = -5;
		
		int x = Roll.roll(6, 3) + cha;
		String y = "Childhood Memories: ";
		if(x <= 3)
			y += "I am still haunted by my childhood, when I was treated badly by my peers";
		else if(x <= 5)
			y += "I spent most of my childhood alone, with no close friends.";
		else if(x <= 8)
			y += "Others saw me as being diiferent or strange, and so I had few companions.";
		else if(x <= 12)
			y += "I had a few close friends and lived an ordinary childhood.";
		else if(x <= 15)
			y += "I had several friends, and my childhood was generally a happy one";
		else if(x <= 17)
			y += "I always found it easy to make Friends, and I loved being around people";
		else
			y += "Everyone knew who I was, and I had friends everywhere I went.";
		return y;
	}
}
