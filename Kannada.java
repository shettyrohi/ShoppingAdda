package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kannada {
public static void getKannada() {
	Scanner scn=new Scanner(System.in);
	int a=150;
	String s="Malgudi Dinagalu";
	System.out.println(" 1.Malgudi Dinagalu                         MRP: 150 Rs.");
	int a1=300;
	String s1="Chankya Kanaja ";
	System.out.println(" 2.Chankya Kanaja                           MRP: 300 Rs.");
	int a2=100;
	String s2="Pranesh panchathanthra";
	System.out.println(" 3.Pranesh panchathanthra                  MRP: 100 Rs.");
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
		System.out.println("enter choice again");
		getKannada();
		break;
	}
	}
	catch(InputMismatchException e) {
		System.out.println("enter ur choice again");
		getKannada();
	}
}
}
