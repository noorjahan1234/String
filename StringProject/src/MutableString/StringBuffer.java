package MutableString;

import java.util.Scanner;

public class StringBuffer {

	public static void main(String[] args) {
		//creating mutable string using StringBuffer
		StringBuilder ab=new StringBuilder("i am learning java");
		ab.append("i am became developer");
		System.out.println(ab);
		System.out.println(ab.replace(0, 1, "A"));
		System.out.println(ab.reverse());
		System.out.println(ab.capacity());
		
	}

}
