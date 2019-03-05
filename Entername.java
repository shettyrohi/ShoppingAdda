package p2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Entername {
	

	 
		public static void entername() {
			Scanner scn=new Scanner(System.in);
			int c=0;
			System.out.print(">*** ENTER NAME: ");
			String s=scn.nextLine();
			for(int i=0;i<s.length();i++)
			{
				if(( s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
				{
					 c++;
				}
				else {
					System.out.println("invalid input.... Again");
					entername();
					break;
				}
			}
			num(s);
			System.out.println();
			System.out.println();
			
			System.out.println("                                            WELCOME:"+" "+s);
			System.out.println();
			Date dNow = new Date( );
		    SimpleDateFormat ft =
		    new SimpleDateFormat ("E yyyy.MM.dd                                             'time:'hh:mm:ss a zzz");
		    System.out.println("Date: " + ft.format(dNow));
		    Caregory.category();
			
			}
		public static void num(String s) {
			Scanner scn=new Scanner(System.in);
			int a=0;
			int c=0;
			while(a<1) 
			{
			System.out.print(">*** MOBILE NUMBER:"+"+91");
			String n=scn.nextLine();
			for (int j=0;j<n.length();j++)
			{
				if(n.length()==10) {
					if(n.charAt(j)>=48&&n.charAt(j)<=57)
				{
				
					c++;
					
				}
				else
				{
					System.out.println("invalid number again");
					num(s);
					break;
				}
				}
				else
				{
					System.out.println("enter 10 digit number");
					num(s);
					break;
				}
				
			}
			break;
			}
			

			
		}

		}
