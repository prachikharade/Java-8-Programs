package com.prachi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfStringByMap {
	public static void main(String args[]) {
	
	String str="hello";
	
	Map<Character,Integer> map=new LinkedHashMap();
	
	char[] chars=str.toCharArray();
	
	for(char ch:chars)
	{
		if(!map.containsKey(ch))
		{
		map.put(ch, 1);	
			
		}else
		{
		int cnt=map.get(ch);
		map.put(ch, cnt+1);	
		}
	}
	
	System.out.println(map);
	

}
}

