package MutableString;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String st=sc.nextLine();  //Noorjahan
		String str="";
		int l=st.length();
		for(int i=l-1; i>=0; i--)
		{
			str=str+st.charAt(i);
		}
		System.out.println(str);  //nahajrooN
	}
}
