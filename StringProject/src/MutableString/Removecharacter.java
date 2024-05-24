package MutableString;

import java.util.Scanner;

public class Removecharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println(name);
		//remove character in the string
		String[] arr=name.split("h");
		// traversing throw complete string
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		}

}
