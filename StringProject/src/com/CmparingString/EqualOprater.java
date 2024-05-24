package com.CmparingString;

public class EqualOprater {

	public static void main(String[] args)
	{
		String str1="java";
		String str2="java";
		if(str1==str2) 
		{
			System.out.println("Refrence are equal");
		}
		else
		{
			System.out.println("Refrence are not equal");
		}
		if(str1.equals(str2))
		{
			System.out.println("Value are Equals");
		}
		else
		{
			System.out.println("Value are not equals");
		}
	}

}
