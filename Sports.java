package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sports {
public static void getSports()
{
	Scanner scn=new Scanner(System.in);
	int a=250;
	String s="Chevit         ";
	System.out.println(" 1.Chevit                              MRP: 250 Rs.");
	int a1=550;
	String s1="Asian          ";
	System.out.println(" 2.Asian                               MRP: 550 Rs.");
	int a2=650;
	String s2="Puma           ";
	System.out.println(" 3.Puma                                MRP: 650 Rs.");
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
		System.out.println("enter choice again");
		getSports();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getSports();
	}
}
}
