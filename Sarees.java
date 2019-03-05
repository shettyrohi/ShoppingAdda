package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sarees {
	public static void getSarees() {
		
			Scanner scn=new Scanner(System.in);
			int a=5000;
			String s="Nalli silk     ";
			System.out.println(" 1.Nalli silk sarees                          MRP: 5000 Rs.");
			int a1=3000;
			String s1="Bombay Selections";
			System.out.println(" 2.Bombay Selections                          MRP: 3000 Rs.");
			int a2=1500;
			String s2="Kalanjali sarees";
			System.out.println(" 3.Kalanjali sarees                           MRP: 1500 Rs.");
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
				getSarees();
				break;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("enter ur choice again");
				getSarees();
			}
	}

}
