package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shirt {
	public static void getShirt() {
		Scanner scn=new Scanner(System.in);
		int a=900;
		String s="U.S Pollo      ";
		System.out.println(" 1.U.S Pollo                  MRP: 900 Rs.");
		int a1=1150;
		String s1="Adidas         ";
		System.out.println(" 2.Adidas                     MRP: 1150 Rs.");
		int a2=1000;
		String s2="Nike           ";
		System.out.println(" 3.Nike                       MRP: 1000 Rs.");
		System.out.println(" 4.Previous page");
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
			Cart.getCart(s,a);
		break;
		case 2: 
			Cart.getCart(s1,a1);
		break;
		case 3: 
			Cart.getCart(s2,a2);
		break;
		case 4: 
			Men.getMen();
		break;
		case 5: 
			Caregory.category();
		break;
		case 6: 
			Exit.getExit();
		break;
		
		default :
			System.out.println("enter choice again");
			getShirt();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getShirt();
		}
	}

}
