package com.prachi;

public class VowelCountInString {
	
	public static void main(String args[])
	{
		String str="Java is Popular Programming Languauge";
		long countVowels=0,countConsonents=0;
		
		str=str.toLowerCase();
		
		countVowels=str.chars().filter(ch->(ch=='a'|| ch=='i' || ch=='o' || ch=='u'|| ch=='e'))
				       .count();
		
		countConsonents=str.chars().filter(ch->(ch!='a' && ch!='i' && ch!='o' && ch!='u'&& ch!='e'))
			                .filter(ch->(ch>='a' && ch<='z')).count();
		
		System.out.println("count of vowels="+countVowels+",countConsonents="+countConsonents);
		
		
	}

}
