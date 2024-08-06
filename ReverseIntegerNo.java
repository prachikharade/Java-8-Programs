package com.prachi;

import java.util.Scanner;

public class ReverseIntegerNo {
	public static void main(String args[])
	{
		int num,reverse=0;
		
		System.out.println("Enter the number to reverse :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(;num!=0;num=num/10)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
		}
	System.out.println("the reverse no is : "+reverse);
		
		
	}

}
