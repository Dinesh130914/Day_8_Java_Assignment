package com.bl.linecomparision;

import java.util.Scanner;

public class UC3 {
	static Scanner sc = new Scanner(System.in);
	static int length1,length2;
	
	public static void Calc_Length() 
	{
		System.out.println("Enter the Value Of X1 ");
		int x1 = sc.nextInt();
		System.out.println("Enter the Value Of X2 ");
		int x2 = sc.nextInt();
		System.out.println("Enter the Value Of Y1 ");
		int y1 = sc.nextInt();
		System.out.println("Enter the Value Of Y2 ");
		int y2 = sc.nextInt();
		
		 length1 = (int) Math.sqrt( (x2 - x1) * (x2 - x1)+(y2 - y1)*(y2 - y1));
		System.out.println("Length of Line 1 : "+length1);
		
		System.out.println("Enter the Value Of A1 ");
		int a1 = sc.nextInt();
		System.out.println("Enter the Value Of A2 ");
		int a2 = sc.nextInt();
		System.out.println("Enter the Value Of B1 ");
		int b1 = sc.nextInt();
		System.out.println("Enter the Value Of B2 ");
		int b2 = sc.nextInt();
		
		 length2 = (int) Math.sqrt( (a2 - a1) * (a2 - a1)+(b2 - b1)*(b2 - b1));
		System.out.println("Length of Line 2 : "+length2);

	}
	public static void comapre() 
	{
		int x = length1;
		int y = length2;
		
		double cp = Double.compare(length1, length2);
		System.out.println();
		if (cp == 1) 
		{
			System.out.println("The Line1 is greater than Line2");
		}
		else if(cp == -1) 
		{
			System.out.println("The Line1 and Line 2 both are Equal");
		}
		else 
		{
			System.out.println("The line1 is Less than Line 2");			
		}
	}
	public static void main(String[] args)
	{
		Calc_Length();
		System.out.println("\n");
		comapre();
	}
}
