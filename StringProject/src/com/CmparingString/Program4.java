package com.CmparingString;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s);
		String s1=s.intern();
		System.out.println(s1);
		String s2="JAVA";
		if(s==s1)
		{
			System.out.println("Refrence are equal");
		}
		else
		{
			System.out.println("Refrence are not equals");
		}
	}

}
