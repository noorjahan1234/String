package com.CmparingString;

public class ProgranCheckName {

	public static void main(String[] args) {
		String s1="RAJU";
		String s2="RAJENDRA";
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
// OUT PUT Sting s1 is greater