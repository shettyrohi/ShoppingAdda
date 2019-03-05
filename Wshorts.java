package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wshorts {
	public static void getWshorts() {
		Scanner scn=new Scanner(System.in);
		int a=950; 
		String s="Zarkons        ";
		System.out.println(" 1.Zarkons                             MRP: 950 Rs.");
		int a1=999;
		String s1="MsFQ           ";
		System.out.println(" 2.MsFQ                                MRP: 999 Rs.");
		int a2=640;
		String s2="Vero Moda      ";
		System.out.println(" 3.Vero Moda                           MRP: 640 Rs.");
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
		case 1:
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
			getWshorts();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getWshorts();
		}
	}

}
