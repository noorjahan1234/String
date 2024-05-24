import java.util.Scanner;

public class Odd_EvenIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//Consuming the new line character
		sc.nextLine();
		
		for(int i=1; i<=n; i++)
		{
			String est="";
			String ost="";
			String str=sc.next();
			char[] ch=str.toCharArray();
			// Iterate through the characters of the string
			for(int j=0; j<ch.length; j++)
			{
				if(j%2==0)
				{
					est=est+ch[j];
				}
				else {
					ost=ost+ch[j];
				}
			}
			System.out.println(est+" "+ost);
			est="";
			ost="";
		}

	}

}
