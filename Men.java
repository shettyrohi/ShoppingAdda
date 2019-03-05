package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Men {
	public static void getMen()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println(" 1.T-Shirts & Shirts");
		System.out.println(" 2.Pants");
		System.out.println(" 3.Shorts");
		System.out.println(" 4.Previous pagr");
		System.out.println(" 5.Home page");
		System.out.println(" 6.Exit");
		System.out.println();
		System.out.println();
		System.out.println("enter your choice: ");
		try {
        int choice=scn.nextInt();
		
		switch(choice)
		{
		case 1 :
			Shirt.getShirt();
		break;
		case 2: 
			Pant.getPant();
		break;
		case 3: 
			Shorts.getShorts();
		break;
		case 4: 
			Cloth.getCloths();
		break;
		case 5: 
			Caregory.category();
		break;
		case 6: 
			Exit.getExit();
		break;
		
		default :
			System.out.println("enter choice again");
			getMen();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getMen();
		}
		
	}

}
