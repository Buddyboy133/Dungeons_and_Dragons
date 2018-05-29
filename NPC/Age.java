package NPC;

public class Age {
	public static String age()
	{
		int x = Roll.roll(8,1);
		String y = "Age: ";
		if(x <= 3)
			y += "Young adult";
		else if(x <= 6)
			y += "Adult";
		else if(x <= 7)
			y += "Middle Age";
		else if(x <= 8)
			y += "Elderly";
		return y;
	}

}
