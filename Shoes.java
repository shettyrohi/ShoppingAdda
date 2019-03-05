package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shoes {
public static void getShoes() {
	Scanner scn=new Scanner(System.in);
	
	System.out.println(" 1.Formal");
	System.out.println(" 2.Casual");
	System.out.println(" 3.Sports");
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
		Formals.getFormals();
	break;
	case 2: 
		Casual.getCasuals();
	break;
	case 3: 
		Sports.getSports();
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
		System.out.println("enter choice again");
		getShoes();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getShoes();
	}

}
}
