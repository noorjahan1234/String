package MutableString;

public class ReverseString {

	public static void main(String[] args) {
		String str="Noorjahan Khatoon";
		String newstr="";
		String[] w=str.split(" ");
		for(int i=w.length-1; i>=0; i--)
		{
			if(i==0)
			{
			newstr=newstr+w[i];
			}
			else
			{
				newstr=newstr+w[i]+" ";
			}
		}
		System.out.println(newstr); //Khatoon Noorjahan
	}

}
