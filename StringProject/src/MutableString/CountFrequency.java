package MutableString;

import java.util.Scanner;

public class CountFrequency 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		//calling the method
		countFrequency(str);
	}

	public static void countFrequency(String str) {
		//Assuming ASCII Character
		int[] frequency=new int[256];
		for(int i=0; i<str.length(); i++)
		{
			//store a character
			char ch=str.charAt(i);
			//count frequency
			frequency[ch]++;
		}
		for(int i=0; i<256; i++)
		{
			if(frequency[i]>0)
				{
				char ch=(char)i;
				
			System.out.println("Character :"+ch+" "+"frequency:"+frequency[i]);
		}
	}
	}
}
