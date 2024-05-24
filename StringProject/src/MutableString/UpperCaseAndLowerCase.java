package MutableString;

import java.util.Scanner;

public class UpperCaseAndLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string name");
		String str=sc.nextLine();
		//covert String to character type array
		char[] arr=str.toCharArray();
		//traversing throw complete array
		for(int i=0; i<arr.length; i++)
		{
			//Checking if Array element capital letter
			if(arr[i]>='A' && arr[i]<='Z')
			{
				//converting into uppercase to lowercase
				int temp=arr[i];
				temp=temp+32;
				//storing the lowercase into same index
				arr[i]=(char)temp;
			}
			//Checking if Array element capital letter
			else if(arr[i]>='a' && arr[i]<='z')
				{
					//converting into uppercase to lowercase
					int temp=arr[i];
					temp=temp-32;
					//storing the lowercase into same index
					arr[i]=(char)temp;
				}
			}
		//converting the character array into string
		String newstr=new String(arr);
		System.out.println(newstr);
	}

}
