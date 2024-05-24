package com.CmparingString;

public class IgnoringCase {

	public static void main(String[] args) {
		String s1="java";
		String s2="JAVA";
		if(s1==s2)
		{
			System.out.println("Refrence are equals");
		}
		else
		{
			System.out.println("Refrence are not equals");
		}
		if(s1.equals(s2))
		{
			System.out.println("Value are equals");
		}
		else
		{
			System.out.println("Value are not equals");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Vales are equal are ignoring case");
		}
		else
		{
			System.out.println("Value are not equal ignoring case");
		}
	}

}
