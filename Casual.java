package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Casual {
	public static void getCasuals()
	{
		Scanner scn=new Scanner(System.in);
		int a=1000; 
		String s="Puma           ";
		System.out.println(" 1.Puma               MRP: 1000 Rs.");
		int a1=1200;
		String s1="Nike           ";
		System.out.println(" 2.Nike               MRP: 1200 Rs.");
		int a2=1500;
		String s2="Emosis         ";
		System.out.println(" 3.Emosis             MRP: 1500 Rs. ");
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
			Cart.getCart(s,a);
		break;
		case 2: 
			Cart.getCart(s1,a1);
		break;
		case 3: 
			Cart.getCart(s2,a2);
		break;
		case 4: 
			 Caregory.category();
		break;
		case 5: 
			Shoes.getShoes();
		break;
		case 6: 
			Exit.getExit();
		break;
		default :
			System.out.println("invalid input enter choice again");
			getCasuals();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input enter ur choice again");
			getCasuals();
		
		
		}
	}

}
