package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Electronics {
	public static void getElectronics()
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" 1.Laptops");
		System.out.println(" 2.Telivisions");
		System.out.println(" 3.Mobiles");
		System.out.println(" 4.Home page");
		System.out.println(" 5.Previous page");
		System.out.println(" 6.Exit");
		System.out.println();
		System.out.println();
		System.out.println("enter your choice: ");
		try {
	     int choice=scn.nextInt();
		
		switch(choice)
		{
		case 1 :
			Laptops.getLaptops();
		break;
		case 2: 
			Tv.getTv();
		break;
		case 3: 
			Mobiles.getMobiles();
		break;
		case 4: 
			 Caregory.category();
		break;
		case 5: 
			Caregory.category();
		break;
		case 6: 
			Exit.getExit();
		break;
		
		default :
			System.out.println("invalid input enter choice again");
			getElectronics();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input enter ur choice again");
			getElectronics();
		}

	}

}
