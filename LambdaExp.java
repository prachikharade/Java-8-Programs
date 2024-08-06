package com.prachi;

import java.util.function.Predicate;

public class LambdaExp {
	public static void main(String args[])
	{
		String[] names= {"Anushka","Anupama","Pooja","Kajol"};
		
         Predicate<String> p=name->name.startsWith("A");
         
         for(String name:names)
         {
        	if(p.test(name))
        	{
        		System.out.println(name);
        	}
         }
	}
	

}
