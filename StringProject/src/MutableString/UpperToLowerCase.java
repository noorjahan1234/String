package MutableString;

import java.util.Scanner;

public class UpperToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		//converting String to character type Array
		char[] arr=str.toCharArray();
		//traversing throw complete Array
		for(int i=0; i<arr.length; i++)
		{
			//checking if array capital letter
			if(arr[i]>='A' && arr[i]<='Z')
			{
				//converting uppercase to lowercase element
				int temp=arr[i];
				temp=temp+32;
				//Storing into lower letter into same index
				arr[i]=(char)temp;
			}
			//checking if array lower letter
			if(arr[i]<='a' && arr[i]>='z')
			{
				//converting  lowercase to uppercase element
				int temp=arr[i];
				temp=temp-32;
				//Storing into upper letter into same index
				arr[i]=(char)temp;
			}
		}
		//converting into character to string 
		String newstr=new String(arr);
		System.out.println(newstr);
	}

}
