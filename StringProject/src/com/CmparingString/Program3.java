package com.CmparingString;

public class Program3 {

	public static void main(String[] args) {
		String s1="RAM";
		String s2="RAMUs";
		int res=s1.compareTo(s2);
		if(res>0) {
			System.out.println("String s1 is greater");
		}
		else if(res<0)
		{
			System.out.println("String s2 is greater");
		}
		else
		{
			System.out.println("both are equals");
		}
	}
}

// OUTPUT   string s2 is greater
