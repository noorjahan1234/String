import java.util.Scanner;

public class RepetadUseDelimiter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString=sc.nextLine();
		System.out.println("Enter the number of repetitions: ");
		int repetitions=sc.nextInt();
		System.out.println("Enter the delimiter");
		String delimiter=sc.next();
		StringBuilder repString=new StringBuilder();
		for(int i=0; i<repetitions; i++)
		{
			repString.append(inputString);
			if(i<repetitions-1) {
				repString.append(delimiter);
			}
		}
		System.out.println(repString);
	}

}
