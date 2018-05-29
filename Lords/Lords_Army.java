package Lords;
import java.util.Random;
import java.util.Scanner;
public class Lords_Army{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.println("Choose a land: (0) not Specific (1) Druarso, (2) Moren, (3) Kurreell, (4) Ezoc, (5) Coiposh, "
				+ "(6) Vunn, (7) Xelwin");
		x = input.nextInt();
		int y = 0;
		if(x == 0)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + pike());
			System.out.println("Ranged = " + ranged());
			System.out.println("Cavalry = "+ cavalry());
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + recharge());
		}	
		if(x == 1)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + (roll(1,6) + 1));
			System.out.println("Ranged = " + ranged());
			System.out.println("Cavalry = "+ cavalry());
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + recharge());
		}
		if(x == 2)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + pike());
			System.out.println("Ranged = " + (roll(1,6) + 1));
			System.out.println("Cavalry = "+ cavalry());
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + recharge());
		}
		if(x == 3)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + pike());
			System.out.println("Ranged = " + ranged());
			System.out.println("Cavalry = "+ (roll(1,6) + 1));
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + recharge());
		}
		if(x == 4)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + pike());
			System.out.println("Ranged = " + ranged());
			System.out.println("Cavalry = "+ cavalry());
			y = ((roll(1,4) * 2)-1);
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + (roll(1,6) + 1));
		}
		if(x == 5)
		{
			System.out.println("Size = " + (roll(1,4) + 3));
			System.out.println("Pike = " + (roll(1,4) - 2));
			System.out.println("Ranged = " + (roll(1,4) - 2));
			System.out.println("Cavalry = "+ (roll(1,4) - 2));
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + (roll(1,6)));
		}
		if(x == 6)
		{
			System.out.println("Size = " + (roll(1,4) + 1));
			System.out.println("Pike = " + (roll(1,6) - 1));
			System.out.println("Ranged = " + (roll(1,6) - 1));
			System.out.println("Cavalry = "+ (roll(1,6) - 1));
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + (roll(1,4)));
		}
		if(x == 7)
		{
			System.out.println("Size = " + size());
			System.out.println("Pike = " + pike());
			System.out.println("Ranged = " + ranged());
			System.out.println("Cavalry = "+ cavalry());
			y = magic();
			System.out.println("Magic = " + y);
			if(y != 0)
				System.out.println("Recharge = " + (roll(1,4)));
		}
	}
	
	public static int roll(int x, int y)
	{
		Random random = new Random();
		int z = 0;
		for(int i = 0; i < y; i++)
			z += (random.nextInt(x) + 1);
		return z; 
	}
	public static int size()
	{
		return (roll(4,1) + 1);
	}
	public static int pike()
	{
		return (roll(4,1) - 1);
	}
	public static int ranged()
	{
		return (roll(4,1) - 1);
	}
	public static int cavalry()
	{
		return (roll(4,1) - 1);
	}
	
	public static int magic()
	{
		return (roll(4,1) - 1);
	}
	
	public static int recharge()
	{
		return roll(6,1);
	}

}
