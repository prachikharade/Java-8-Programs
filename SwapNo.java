package com.prachi;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String args[])
	{
		int a,b;
		System.out.println("enter the two numbers :");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		b=sc.nextInt();
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("swapping of two no:"+a+","+b);
		
		
	}

}
