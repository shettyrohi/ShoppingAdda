package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Women {
	public static void getWomen() {
		Scanner scn=new Scanner(System.in);
		System.out.println(" 1.T-Shirts & Shirts");
		System.out.println(" 2.Pants");
		System.out.println(" 3.Shorts & Skirts");
		System.out.println(" 4.Saree");
		System.out.println(" 5.Previous pagr");
		System.out.println(" 6.Home page");
		System.out.println(" 7.Exit");
		System.out.println();
		System.out.println();
	System.out.println("enter your choice: ");
	try {
        int choice=scn.nextInt();
		
		switch(choice)
		{
		case 1 :
			Wshirt.getWshirt();
		break;
		case 2: 
			Wpants.getWpants();
		break;
		case 3: 
			Wshorts.getWshorts();
			break;
		case 4: 
			Sarees.getSarees();
		break;
		case 5: 
			Cloth.getCloths();
		break;
		case 6: 
			Caregory.category();
		break;
		case 7: 
			Exit.getExit();
		break;
		
		default :
			System.out.println("enter choice again");
			getWomen();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getWomen();
		}
	}

}
