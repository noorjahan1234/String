package com.CmparingString;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String");
		String s1=sc.next();
		String s2=sc.next();
		int res=s1.compareTo(s2);
		if(res>0)
		{
			System.out.println("String s1 is grater");
		}
		else if(res<0)
		{
			System.out.println("String s2 is greater");
		}
		else
		{
			System.out.println("both are equals");
		}
	}

}
