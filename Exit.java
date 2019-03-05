package p2;

import java.util.Scanner;

public class Exit
{
	public static void getExit()
	{Scanner scn=new Scanner(System.in);
		System.out.println("Are sure Want to exit (y/n)?");
		 String yes = scn.next();
		 if(yes.equals("y"))
			{

				System.out.println("*************** THANK YOU FOR VISITING *****************");
				
			}
		 else if(yes.equals("n")) {
		 Caregory.category();
		 }
		 else
		 {
			 System.out.println(" Invalid input enter again");
			 getExit();
		 }
		 
	}
}
