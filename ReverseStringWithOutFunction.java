package com.prachi;

public class ReverseStringWithOutFunction {
	
	public static void main(String args[])
	{
		String str="Shravi";
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.println(chars[i]);
		}
	}

}
