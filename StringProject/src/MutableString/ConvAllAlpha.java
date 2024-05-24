package MutableString;

public class ConvAllAlpha {

	public static void main(String[] args) {
		String str="i am learning java";
		String newstr="";
		//convert string in to word
		String[] word=str.split(" ");
		for(int i=word.length-1; i>=0; i--)
		{
			if(i==0)
			{
			newstr=newstr+word[i];
			}
			else
			{
				newstr=newstr+word[i]+" ";
			}
		}
		System.out.println(newstr);
	}

}
