package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tv {
public static void getTv()
{
	Scanner scn=new Scanner(System.in);
	int a=50000;
	String s="Panasonic      ";
	System.out.println(" 1.Panasonic                    MRP: 50000 Rs.");
	int a1=40000;
	String s1="Samsung        ";
	System.out.println(" 2.Samsung                      MRP: 40000 Rs.");
	int a2=35000;
	String s2="Onidac         ";
	System.out.println(" 3.Onida                        MRP: 35000 Rs.");
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
		Electronics.getElectronics();
	break;
	case 6: 
		Exit.getExit();
	break;
	
	default :
		System.out.println("enter choice again");
		getTv();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getTv();
	}
}
}
