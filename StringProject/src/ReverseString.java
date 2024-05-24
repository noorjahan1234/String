import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		String s="i am learning java";
		/*
		 * String s1=sc.next(); System.out.println(s+" "+s1); s=s.toUpperCase();
		 * s1=s1.toLowerCase(); System.out.println(s+" "+s1);
		 */
		// revers string 
		String revstr="";
		String[] arr=s.split("");
		//find the length s
		for(int i=0; i<arr.length; i++)
		{
			//store one by one character
			char[] arr1=arr[i].toCharArray();
			//find reverse string end point
			for(int j=arr1.length-1; j>=0; j--) 
			{
				//Store one by one 	char
				revstr=revstr+arr1[j];
			}
			//store reverse string
			arr[i]=revstr+" ";
		}
		//create new string after that store 
		String newstr="";
		//storing the string 
		for(int i=0; i<arr.length; i++)
		{
			newstr=newstr+arr[i];
		}
		System.out.println(newstr);
	}
}
