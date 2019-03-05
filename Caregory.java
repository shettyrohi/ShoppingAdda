package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Caregory {
	
	public static void category()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("________________________________________________________________________________________________________________");
		System.out.println("                                    WELCOME TO HOME PAGE");
		System.out.println();
		System.out.println();
		System.out.println("        CATEGORIES");
		System.out.println("1.Cloths");
		System.out.println("2.Shoes");
		System.out.println("3.Electronics");
		System.out.println("4.Books");
		System.out.println("5.Exit");
		
		System.out.println("________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.print("enter your choice:");
		try {
			int choice=scn.nextInt();
		switch(choice)
		{
		case 1 :
			Cloth.getCloths();
		break;
		case 2: 
			Shoes.getShoes();
		break;
		case 3: 
			Electronics.getElectronics();
		break;
		case 4: 
			Book.getBooks();
		break;
		case 5: 
			Exit.getExit();
		break;
		
		
		default :
			System.out.println("invalid input enter choice again");
		category();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input enter ur choice again");
			category();
		}
	}

}
