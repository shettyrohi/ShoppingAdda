package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class More {

	public static void more(ArrayList iarray,ArrayList array,ArrayList aarray,ArrayList parray) {
		System.out.println("________________________________________________________________________");
		System.out.println("enter your choice");
		System.out.println();
		System.out.println("1.Add More items");
		System.out.println("2.Viewcart");
		System.out.println("3.Bill");
		System.out.println("4.Exit");
		System.out.println();
		System.out.println("enter ur choice");
		Scanner scn=new Scanner(System.in);
		try {
	        int choice=scn.nextInt();
			
			switch(choice)
			{
			case 1:
				Caregory.category();
				break;
			case 2:
				View.view(iarray,array,aarray,parray);
				break;
			case 3:
				Bill.bills(iarray,array,aarray,parray);
				break;
			case 4:
				Exit.getExit();
				break;
				default:
					System.out.println("Again");
					more( iarray, array, aarray, parray);
					break;
			}	
			}
		catch(InputMismatchException e)
			{
				System.out.println("Again");
				more( iarray, array, aarray, parray);
			}
	}
}
