package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kids {
public static void getKids() {
	Scanner scn=new Scanner(System.in);
	int a=400;
	String s="Kids Dress     ";
	System.out.println(" 1.Kids Dress                MRP: 400 Rs.");
	int a1=500;
	String s1="Toys           ";
	System.out.println(" 2.Toys                      MRP: 500 Rs.");
	int a2=600;
	String s2="Kids bag       ";
	System.out.println(" 3.Kids bag                  MRP: 600 Rs.");
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
		Cart.getCart(s,a);
	break;
	case 2: 
		Cart.getCart(s1,a1);
	break;
	case 3: 
		Cart.getCart(s2,a2);
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
		getKids();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getKids();
	}
}
}
