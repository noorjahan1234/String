package com.CmparingString;

import java.util.Scanner;

public class ConvertStringtoChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String s=sc.nextLine();
	// converting String to char type array
	char[] ch=s.toCharArray();
	//displaying the elements of the character
	for(int x : ch)
	{
		System.out.println(x+" ");
	}
	}

}
