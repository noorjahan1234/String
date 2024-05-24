import java.util.HashMap;
import java.util.Scanner;

public class CheckNameAndNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> hm=new HashMap<>();
		for(int i=1; i<=n; i++)
		{
			String input=sc.nextLine();
			String[] sp=input.split(" ");
			String name=sp[0];
			int num=Integer.parseInt(sp[1]);
			hm.put(name, num);
		}
		System.out.print(hm);
		while(sc.hasNext()) {
			String name=sc.next();
			if(hm.containsKey(name)) {
				System.out.println(name+"="+hm.get(name));
			}
			else {
				System.out.println("Not found");
			}
		}
	}

}
