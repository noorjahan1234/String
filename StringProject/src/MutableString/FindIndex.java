package MutableString;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int index=sc.nextInt();
		char ch=findIndex(str,index);
		System.out.println("Find the Character "+index+" "+ ch);
	}

	public static char findIndex(String str, int index) {
			char ch=str.charAt(index);
		return ch;
	}

}
