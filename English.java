package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class English {
public static void getEnglish() {
Scanner scn=new Scanner(System.in);
	int a=150;
	String s="Her Last Wish  ";
	System.out.println(" 1.Her Last Wish              MRP: 150 Rs.");
	int a1=250;
	String s1="One Indian Girl";
	System.out.println(" 2.One Indian Girl            MRP: 250 Rs.");
	int a2=200;
	String s2="Wings of Fire  ";
	System.out.println(" 3.Wings of Fire              MRP: 200 Rs.");
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
		Book.getBooks();
	break;
	case 6: 
		Exit.getExit();
	break;
	
	default :
		System.out.println(" invalid input,enter choice again");
		getEnglish();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("invalid input, enter ur choice again");
		getEnglish();
	}
}
}
