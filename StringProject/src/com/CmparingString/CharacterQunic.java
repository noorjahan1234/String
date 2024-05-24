package com.CmparingString;

import java.util.Scanner;

public class CharacterQunic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int uni=ch;
		System.out.println("Unicode values of char "+ch+ " is " +uni);
	}

}
