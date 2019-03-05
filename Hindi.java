package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hindi {
	public static void getHindi()
	{
		Scanner scn=new Scanner(System.in);
		int a=150;
		String s="Meelo Se Din   ";
		System.out.println(" 1.Meelo Se Din                    MRP: 150 Rs.");
		int a1=250;
		String s1="U P 65         ";

		System.out.println(" 2.U P 65                          MRP: 250 Rs.");
		int a2=100;
		String s2="Banaras Talkies";

		System.out.println(" 3.Banaras Talkies                 MRP: 100 Rs.");
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
			getHindi();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getHindi();
		}
	}

}
