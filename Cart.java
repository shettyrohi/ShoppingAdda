package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cart {
	//static int z;
	static int n;
	static int x;
	//static double d;
	
	static ArrayList  array=new ArrayList();
	static	ArrayList parray=new ArrayList();
	static	ArrayList iarray=new ArrayList();
	static	ArrayList aarray=new ArrayList();
	public static void getCart( String s, int a )
	{ 
		
		Scanner scn=new Scanner(System.in);
		System.out.print("enter quantity: ");
		try {
		n=scn.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("again");
			getCart( s,  a );
		}
		
		ok(s,a);
	}
	public static void ok(String s, int a) {
		Scanner scn=new Scanner(System.in);
		System.out.println("are you sure you wnt to add "+n+" items to cart");
		System.out.print("then enter (y/n): ");
		
		 String yes = scn.next();
		 System.out.println();
		 if(yes.equals("y"))
		 {
		double c=n*a;
		iarray.add(s);
		parray.add(c);
		array.add(n);
		aarray.add(a);
		x+=n;
		System.out.println(" "+x+" item added to cart");
		More.more( iarray, array, aarray, parray);
		 }
		 else if(yes.equals("n")) {
			 getCart(s,a);
		 }
		 else {
			 System.out.println("Sorry enter valid input");
			 ok(s,a);
		
	}
	}
}

