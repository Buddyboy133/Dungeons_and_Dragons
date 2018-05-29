package Dungeon;

import java.util.Random;
import java.util.Scanner;

public class Treasure {
	public static void treasure(int rating, boolean horde)
	{
		int cr = rating;
		boolean h = horde;
		if(h == true)
		{
			if(cr <= 4)
				cr0_4h();
			else if(cr <= 10)
				cr5_10h();
			else if (cr <= 16)
				cr11_16h();
			else 
				cr17h();
		}
		else
		{
			if(cr <= 4)
				cr0_4();
			else if(cr <= 10)
				cr5_10();
			else if (cr <= 16)
				cr11_16();
			else 
				cr17();
		}
		
	}	
	
	public static void newtreasure()
	{
		Scanner input = new Scanner(System.in);
		int cr;
		boolean horde = false;
		System.out.println("What CR is the Group?");
		cr = input.nextInt();
		System.out.println("Is it a horde? (1 is yes)");
		int x = input.nextInt();
		if(x == 1)
			horde = true;
		treasure(cr, horde);
	}
	
	public static void cr0_4()
	{
		int x = roll(100,1);
		String y = "";
		int z = 0;
		if(x <=30)
			y = roll(6,5) + "cp";
		else if(x <= 60)
			y = roll(6,4) + "sp";
		else if(x <= 70)
			y = roll(6,3) + "ep";
		else if(x <= 95)
			y = roll(6,3) + "gp";
		else
			y = roll(6,1) + "pp";
		System.out.println(y);
	}
	
	public static void cr5_10()
	{
		int x = roll(100,1);
		String y = "";
		int z = 0;
		if(x <=30)
			y = (roll(6,4)*100) + "cp " + (roll(6,1)*10) + "ep";
		else if(x <= 60)
			y = (roll(6,6)*10) + "sp "+ (roll(6,2)*10) + "gp";
		else if(x <= 70)
			y = (roll(6,3)*10) + "ep "+ (roll(6,2)*10) + "gp";
		else if(x <= 95)
			y = (roll(6,4)*10) + "gp";
		else
			y = (roll(6,2)*10) + "gp "+ (roll(6,3)) + "pp";
		System.out.println(y);
	}
	
	public static void cr11_16()
	{
		int x = roll(100,1);
		String y = "";
		int z = 0;
		if(x <=20)
			y = (roll(6,4)*100) + "sp " + (roll(6,1)*100) + "gp"; 
		else if(x <= 35)
			y = (roll(6,1)*100) + "ep " + (roll(6,1)*100) + "gp";
		else if(x <= 75)
			y = (roll(6,2)*100) + "gp " + (roll(6,1)*10) + "pp";	
		else
			y = (roll(6,2)*100) + "gp " + (roll(6,2)*10) + "pp";
		System.out.println(y);
	}
	
	public static void cr17()
	{
		int x = roll(100,1);
		String y = "";
		int z = 0;
		if(x <= 15)
			y = (roll(6,2)*1000) + "ep " + (roll(6,8)*100) + "gp";
		else if(x <= 55)
			y = (roll(6,1)*1000) + "gp " + (roll(6,1)*100) + "pp";	
		else
			y = (roll(6,1)*1000) + "gp " + (roll(6,2)*100) + "pp";
		System.out.println(y);
	}
	public static void cr0_4h()
	{
		int x = roll(100,1);
		int z = 0;
		String y = "";
		String c = "";
		String cp = (roll(6,6)*100) + "cp ";
		String sp = (roll(6,3)*100) +"sp ";
		String gp = (roll(6,2)*10) +"gp ";
		String mi = "";
		if(x <=6)
		{
			y = "";
		}
		else if(x <= 16)
		{
			y = roll(6,2) + " 10 gp gems";
		}
		else if(x <= 26)
		{
			y = roll(4,2) + " 25 gp art objects";
		}
		else if(x <= 36)
		{
			y = roll(6,2) + " 50 gp gems";
		}
		else if(x <= 44)
		{
			y = roll(6,2) + " 10 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 52)
		{
			y = roll(4,2) + " 25 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 60)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 65)
		{
			y = roll(6,2) + " 10 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 70)
		{
			y = roll(4,2) + " 25 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 75)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 78)
		{
			y = roll(6,2) + " 10 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 80)
		{
			y = roll(4,2) + " 25 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 85)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 92)
		{
			y = roll(4,2) + " 25 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 97)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 99)
		{
			y = roll(4,2) + " 25 gp art objects";
			mi += MagicTables.G() + ", ";
		}
		else
		{
			y = roll(6,2) + " 50 gp gems";
			mi += MagicTables.G() + ", ";
		}
		c = gp + sp + cp;
		System.out.println(c);
		System.out.println(y);
		System.out.println(mi);
	}
	
	public static void cr5_10h()
	{
		int x = roll(100,1);
		int z = roll(100,1);
		String y = "";
		String c = "";
		String cp = (roll(6,2)*100) + "cp ";
		String sp = (roll(6,2)*1000) +"sp ";
		String gp = (roll(6,6)*100) +"gp ";
		String pp = (roll(6,3)*10) +"pp ";
		String mi = "";
		if(x <= 4)
		{
			y = "";
		}
		else if(x <= 10)
		{
			y = roll(4,2) + " 25 gp art objects";
		}
		else if(x <= 16)
		{
			y = roll(6,2) + " 50 gp gems";
		}
		else if(x <= 22)
		{
			y = roll(6,2) + " 100 gp gems";
		}
		else if(x <= 28)
		{
			y = roll(6,2) + " 250 gp art objects";
		}
		else if(x <= 32)
		{
			y = roll(6,2) + " 25 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 36)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 40)
		{
			y = roll(6,2) + " 100 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 44)
		{
			y = roll(6,2) + " 250 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
		}
		else if(x <= 49)
		{
			y = roll(6,2) + " 25 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 54)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 59)
		{
			y = roll(6,2) + " 100 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 63)
		{
			y = roll(6,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 66)
		{
			y = roll(6,2) + " 50 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 69)
		{
			y = roll(6,2) + " 25 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 72)
		{
			y = roll(6,2) + " 100 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 74)
		{
			y = roll(6,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 76)
		{
			y = roll(6,2) + " 25 gp art objects";
			mi = MagicTables.D();
		}
		else if(x <= 78)
		{
			y = roll(6,2) + " 50 gp gems";
			mi = MagicTables.D();
		}
		else if(x <= 79)
		{
			y = roll(6,2) + " 100 gp gems";
			mi = MagicTables.D();
		}
		else if(x <= 80)
		{
			y = roll(6,2) + " 250 gp art objects";
			mi = MagicTables.D();
		}
		else if(x <= 84)
		{
			y = roll(6,2) + " 25 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 88)
		{
			y = roll(6,2) + " 50 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 91)
		{
			y = roll(6,2) + " 100 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 94)
		{
			y = roll(6,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.F() + ", ";
		}
		else if(x <= 96)
		{
			y = roll(6,2) + " 100 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 98)
		{
			y = roll(6,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 99)
		{
			y = roll(6,2) + " 100 gp gems";
			mi = MagicTables.H();
		}
		else
		{
			y = roll(6,2) + " 250 gp art objects";
			mi = MagicTables.H();
		}
		c = pp + gp + sp + cp;
		System.out.println(c);
		System.out.println(y);
		System.out.println(mi);
	}
	
	public static void cr11_16h()
	{
		int x = roll(100,1);
		int z = roll(100,1);
		String y = "";
		String c = "";
		String gp = (roll(6,4)*1000) +"gp ";
		String pp = (roll(6,5)*100) +"pp ";
		String mi = "";
		if(x <=3)
		{
			y = "";
		}
		else if(x <= 6)
		{
			y = roll(4,2) + " 250 gp art objects";
		}
		else if(x <= 9)
		{
			y = roll(4,2) + " 750 gp art objects";
		}
		else if(x <= 12)
		{
			y = roll(6,3) + " 500 gp gems";
		}
		else if(x <= 15)
		{
			y = roll(6,3) + " 1000 gp gems";
		}
		else if(x <= 19)
		{
			y = roll(4,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 23)
		{
			y = roll(4,2) + " 750 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 26)
		{
			y = roll(6,3) + " 500 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 29)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.A() + ", ";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.B() + ", ";
		}
		else if(x <= 35)
		{
			y = roll(4,2) + " 250 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 40)
		{
			y = roll(4,2) + " 750 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 45)
		{
			y = roll(6,3) + " 500 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 50)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 54)
		{
			y = roll(4,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 58)
		{
			y = roll(4,2) + " 750 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 62)
		{
			y = roll(6,3) + " 500 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 66)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 68)
		{
			y = roll(4,2) + " 250 gp art objects";
			mi = MagicTables.E();
		}
		else if(x <= 70)
		{
			y = roll(4,2) + " 750 gp art objects";
			mi = MagicTables.E();
		}
		else if(x <= 72)
		{
			y = roll(6,3) + " 500 gp gems";
			mi = MagicTables.E();
		}
		else if(x <= 74)
		{
			y = roll(6,3) + " 1000 gp gems";
			mi = MagicTables.E();
		}
		else if(x <= 76)
		{
			y = roll(4,2) + " 250 gp art objects";
			mi = MagicTables.F();
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 78)
		{
			y = roll(4,2) + " 750 gp art objects";
			mi = MagicTables.F();
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 80)
		{
			y = roll(6,3) + " 500 gp gems";
			mi = MagicTables.F();
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 82)
		{
			y = roll(6,3) + " 1000 gp gems";
			mi = MagicTables.F();
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 85)
		{
			y = roll(4,2) + " 250 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 88)
		{
			y = roll(4,2) + " 750 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 90)
		{
			y = roll(6,3) + " 500 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 92)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 94)
		{
			y = roll(4,2) + " 250 gp art objects";
			mi = MagicTables.I();
		}
		else if(x <= 96)
		{
			y = roll(4,2) + " 750 gp art objects";
			mi = MagicTables.I();
		}
		else if(x <= 98)
		{
			y = roll(6,3) + " 500 gp gems";
			mi = MagicTables.I();
		}
		else
		{
			y = roll(6,3) + " 1000 gp gems";
			mi = MagicTables.I();
		}
		c = pp + gp;
		System.out.println(c);
		System.out.println(y);
		System.out.println(mi);
	}
	
	public static void cr17h()
	{
		int x = roll(100,1);
		int z = roll(100,1);
		String y = "";
		String c = "";
		String gp = (roll(6,12)*1000) +"gp ";
		String pp = (roll(6,8)*1000) +"pp ";
		String mi = "";
		if(x <=2)
		{
			y = "";
		}
		else if(x <= 5)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(8,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 8)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(8,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 11)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(8,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 14)
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(8,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.C() + ", ";
		}
		else if(x <= 22)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 30)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 38)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 46)
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.D() + ", ";
		}
		else if(x <= 52)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.E() + ", ";
		}
		else if(x <= 58)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.E() + ", ";
		}
		else if(x <= 63)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.E() + ", ";
		}
		else if(x <= 68)
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(6,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.E() + ", ";
		}
		else if(x <= 69)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 70)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 71)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 72)
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.G() + ", ";
		}
		else if(x <= 74)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 76)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 78)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 80)
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.H() + ", ";
		}
		else if(x <= 85)
		{
			y = roll(6,3) + " 1000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.I() + ", ";
		}
		else if(x <= 90)
		{
			y = roll(10,1) + " 2500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.I() + ", ";
		}
		else if(x <= 95)
		{
			y = roll(4,1) + " 7500 gp art objects";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.I() + ", ";
		}
		else
		{
			y = roll(8,1) + " 5000 gp gems";
			z = roll(4,1);
			for(int i = 0; i <= z; i++)
				mi += MagicTables.I() + ", ";
		}
		c = pp + gp;
		System.out.println(c);
		System.out.println(y);
		System.out.println(mi);
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
