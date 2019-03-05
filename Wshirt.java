package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wshirt {
public static void getWshirt()
{
	Scanner scn=new Scanner(System.in);
	int a=550;
	String s="flickzon       ";
	System.out.println(" 1.flickzon                                MRP: 550 Rs.");
	int a1=660;
	String s1="Indietoga      ";
	System.out.println(" 2.Indietoga                               MRP: 660 Rs.");
	int a2=750;
	String s2="Pluss          ";
	System.out.println(" 3.Pluss                                   MRP: 750 Rs.");
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
	
		Cart.getCart(s,a );
	break;
	case 2: 
		Cart.getCart( s1,a1);
	break;
	case 3: 
		Cart.getCart(s2,a2);
	break;
	case 4: 
		Women.getWomen();
	break;
	case 5: 
		Caregory.category();
	break;
	case 6: 
		Exit.getExit();
	break;
	
	default :
		System.out.println("enter choice again");
		getWshirt();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getWshirt();
	}
}
}
