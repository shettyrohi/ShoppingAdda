package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Book {
	public static void getBooks()
	{
Scanner scn=new Scanner(System.in);
		
		System.out.println(" 1.English  ");
		System.out.println(" 2.Hindi");
		System.out.println(" 3.Kannada");
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
			English.getEnglish();
		break;
		case 2: 
			Hindi.getHindi();
		break;
		case 3: 
			Kannada.getKannada();
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
			System.out.println("invalid input enter choice again");
			getBooks();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input enter ur choice again");
			getBooks();
		}
		

		
	}

}
