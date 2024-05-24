package MutableString;

public class countFrequency2 {

	public static void main(String[] args) {
		String str="My name Noorjahan";
		// covert string to char type
		char[] ch=str.toCharArray();
		//count length
		int count[]=new int[ch.length];
		//traversing throw complete array
		for(int i=0; i<ch.length; i++)
		{
			//count i onre time
			count[i]=1;
			
			for(int j=i+1; j<ch.length; j++)
			{
				//check i and j equal or not
				if(ch[i]==ch[j])
				{
					//count ++ char
					count[i]++;
					ch[j]='0';
				}
			}
		}
		System.out.println(str);
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!=' ' && ch[i]!='0')
			{
				System.out.println("The count Frequency");
				System.out.println(ch[i]+" "+count[i]);
			}
		}

	}

}
