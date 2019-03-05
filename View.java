package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
public static void view(ArrayList iarray,ArrayList array,ArrayList aarray,ArrayList parray) {
	Scanner scn=new Scanner(System.in);
	System.out.println();
	System.out.println("************************************************************************");
	System.out.println();
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%% Items Present In Cart %%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println();
	System.out.println("________________________________________________________________________");
	System.out.println("SI.no\t\titems\t\t number of item\t\t ammount");
	System.out.println("________________________________________________________________________");
	for(int i=0;i<iarray.size();i++)
	{
	System.out.println(i+1+"\t\t"+iarray.get(i)+"\t\t"+array.get(i)+"\t\t  "+aarray.get(i)+" Rs.");
	
	}
	System.out.println("________________________________________________________________________");
	System.out.println();
	System.out.println("1.Add more items");
	System.out.println("2.Bill");
	System.out.println("3.Exit");
	System.out.println("4.To remove item from cart");
	System.out.println();
	System.out.println("enter your choice");
	System.out.println();
	try {
        int choice=scn.nextInt();
		
		switch(choice)
		{
		case 1:
			Caregory.category();
			break;
		case 2:
			Bill.bills(iarray,array,aarray,parray);
			break;
		case 3:
			Exit.getExit();
			break;
		case 4:
			Remove.remove(iarray, array, aarray, parray);
			break;
			default:
				System.out.println("Again");
				view( iarray, array, aarray, parray);
				break;
		}	
		}
	catch(InputMismatchException e)
		{
			System.out.println("Again");
			view( iarray, array, aarray, parray);
		}
	
}
}
