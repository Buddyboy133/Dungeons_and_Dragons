package Settlements;

public class Warehouse {
	public static String warehouse()
	{
		int x = Roll.roll(20,1);
		String y = "Warehouse: ";
		if(x <= 2)
			y += "Empty";
		else if(x<= 4)
			y += "Abandoned";
		else if(x <= 6)
			y += "Heavily guarded, expensive goods ";
		else if(x <= 10)
			y += "Cheap goods";
		else if(x <= 14)
			y += "Bulk goods";
		else if(x <= 15)
			y += "Live animals ";
		else if(x <= 17)
			y += "Weaponsfarmor";
		else if(x <= 19)
			y += "Goods from a distant land ";
		else 
			y += "Secret smuggler's den";	
		return y;
	}

}
