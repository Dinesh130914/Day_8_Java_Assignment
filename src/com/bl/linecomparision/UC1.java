package com.bl.linecomparision;

import java.util.Scanner;

public class UC1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Lenth Of the two Line : "+Calc_Length());
	}
	public static int Calc_Length() 
	{
		System.out.println("Enter the Value Of X1 ");
		int x1 = sc.nextInt();
		System.out.println("Enter the Value Of X2 ");
		int x2 = sc.nextInt();
		System.out.println("Enter the Value Of Y1 ");
		int y1 = sc.nextInt();
		System.out.println("Enter the Value Of Y2 ");
		int y2 = sc.nextInt();
		
		int length = (int) Math.sqrt( (x2 - x1) * (x2 - x1)+(y2 - y1)*(y2 - y1));
		
		
		return length;
	}
}
