package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mobiles {
	public static void getMobiles()
	{
		Scanner scn=new Scanner(System.in);
		int a=15000;
		String s="Asus           ";
		System.out.println(" 1.Asus                       MRP: 15000 Rs.");
		int a1=12000;
		String s1="Samsung       ";
		System.out.println(" 2.Samsung                    MRP: 12000 Rs.");
		int a2=8000;  
		String s2="Nokia          ";
		System.out.println(" 3.Nokia                      MRP: 8000 Rs.");
		int a3=11000;
		String s3="MI            ";
		System.out.println(" 4.MI                         MRP: 11000 Rs.");
		int a4=18000;
		String s4="Moto ";
		System.out.println(" 5.Moto                       MRP: 18000 Rs.");
		System.out.println(" 6.Home page");
		System.out.println(" 7.Previous page");
		System.out.println(" 8.Exit");
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
			Cart.getCart(s3,a3);
		break;
		case 5: 
			Cart.getCart(s4,a4);
		break;

		case 6: 
			 Caregory.category();
		break;
		case 7: 
			Electronics.getElectronics();
		break;
		case 8: 
			Exit.getExit();
		break;
		default :
			System.out.println("enter choice again");
			getMobiles();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getMobiles();
		}
	}

}
