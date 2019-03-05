package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Laptops {
	public static  void getLaptops()
	{
Scanner scn=new Scanner(System.in);
		int a=45000;
		String s="Lenovo         ";
		System.out.println(" 1.Lenovo                      MRP: 45000 Rs.");
		int a1=35000;
		String s1="HP             ";
		System.out.println(" 2.HP                          MRP: 35000 Rs.");
		int a2=40000;
		String s2="Dell           ";
		System.out.println(" 3.Dell                        MRP: 40000 Rs.");
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
			Electronics.getElectronics();
		break;
		case 6: 
			Exit.getExit();
		break;
		
		default :
			System.out.println("enter choice again");
			getLaptops();
			break;
		}
		}
		catch(InputMismatchException e) {
			System.out.println("enter ur choice again");
			getLaptops();
		}	}

}
