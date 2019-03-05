package p2;

import java.util.ArrayList;

public class Bill {
	static int z;
    
	static double d;
	static int cnt;
	static double gst;
public static void bills(ArrayList iarray,ArrayList array,ArrayList aarray,ArrayList parray) {
	System.out.println("**************************************************************************************************");
	System.out.println();
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% BILL %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println();
	System.out.println("__________________________________________________________________________________________________");
	System.out.println();
	System.out.println("SI.no\t\tItemname\t\tamount\t\tnumber of item\t\tTotal amount");
	System.out.println("__________________________________________________________________________________________________");
	System.out.println();
	for(int i=0;i<iarray.size();i++)
	{
		System.out.println(i+1+"\t\t"+iarray.get(i)+"\t\t"+aarray.get(i)+"\t\t"+array.get(i)+"\t\t\t"+parray.get(i)+" Rs.");
		d+= (double) parray.get(i);
	}
	System.out.println();
	System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println();
	System.out.println("Total                                                                             "+d+" Rs.");
	double e=0.06;
	System.out.println();
	System.out.println("6% CGST                                                                           "+(d*e)+" Rs.");
	System.out.println("6% SGST                                                                           "+(d*e)+" Rs.");
	System.out.println("_________________________________________________________________________________________________");
	System.out.println("Grand Total                                                                       "+(d+(d*e)*2)+" Rs.");
	System.out.println("_________________________________________________________________________________________________");
	System.out.println();
	System.out.println();
	System.out.println("@@@                           +++++ THANK YOU VISIT AGAIN +++++                               @@@");

}
}
