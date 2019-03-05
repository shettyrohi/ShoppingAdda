package p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Remove {
public static void remove(ArrayList iarray,ArrayList array,ArrayList aarray,ArrayList parray) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter SI.no of the item to remove");
	try {
	int n=scn.nextInt();
	if(n<=array.size()) {
	int m=n-1;
	iarray.remove(m);
	array.remove(m);
	parray.remove(m);
	aarray.remove(m);
	View.view( iarray, array, aarray, parray);}
	else {
		System.out.println("enter again");
		remove(iarray,array,aarray,parray);
	}
	}
	catch(InputMismatchException e ) {
		System.out.println("enter again");
		remove(iarray,array,aarray,parray);
	}
	
}
}
