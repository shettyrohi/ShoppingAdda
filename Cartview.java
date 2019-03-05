package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cartview {
public static void cartView(ArrayList iarray,ArrayList array,ArrayList aarray,ArrayList parray) {
	Scanner scn=new Scanner(System.in);

	System.out.println("1.View cart");
	System.out.println("2.bill");
	System.out.println("1.exit");
	System.out.println("enter ur choice");
	
	try {
        int choice=scn.nextInt();
		
		switch(choice)
		{
		case 1:
			View.view(iarray,array,aarray,parray);
			break;
		case 2:
			Bill.bills(iarray,array,aarray,parray);
			break;
		case 3:
			Exit.getExit();
			break;
			default:
				System.out.println("Again");
				cartView( iarray, array, aarray, parray);
				break;
		}	
		}
	catch(InputMismatchException e)
		{
			System.out.println("Again");
			cartView( iarray, array, aarray, parray);
		}
}
}