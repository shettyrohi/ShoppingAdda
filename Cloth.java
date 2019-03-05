package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cloth {
	public static void getCloths()
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" 1.Men");
		System.out.println(" 2.Women");
		System.out.println(" 3.Kids");
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
			Men.getMen();
		break;
		case 2: 
			Women.getWomen();
		break;
		case 3: 
			Kids.getKids();
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
			getCloths();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println(" invalid input enter ur choice again");
			getCloths();
		}

	}

}
