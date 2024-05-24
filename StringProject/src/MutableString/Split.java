package MutableString;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the name");
		String str=sc.nextLine();
		//print name
		System.out.println(str);
		System.out.println("Character in string");
		//convert string to character
		char[] ch=str.toCharArray();
		//traversing throw complete array
				for(int i=0; i<ch.length; i++)
				{
					//printing character
					System.out.print(ch[i]+" ");
				}
	}

}
