package com.CmparingString;

public class Contan {

	public static void main(String[] args) {
		String s=new String("Noorjahan");
		System.out.println(s);//Noorjahan
		System.out.println(s.charAt(0));//N
		System.out.println(s.contentEquals("khatoon"));//true
		System.out.println(s.isEmpty());//false
		System.out.println(s.contains("Noor")); //True
		System.out.println(s.indexOf('k')); //-1
		System.out.println(s.indexOf('j')); //4
		System.out.println(s.isBlank());     //false
		System.out.println(s.indexOf('a'));  //5
		System.out.println(s.replace('o', 'u'));  //Nuurjahan
		System.out.println(s.endsWith("an"));  //true
		System.out.println(s.startsWith("Noor")); //true
		System.out.println(s.length()); //9
	}

}
