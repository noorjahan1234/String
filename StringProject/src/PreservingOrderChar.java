import java.util.Scanner;

public class PreservingOrderChar {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the String");
        String str="asdf1234";
        System.out.println(numGame(str));
    }

    public static String numGame(String str) {
        StringBuilder stb=new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(!Character.isDigit(ch)) {
                stb.append(ch);
            }
        }
        return stb.toString();
    }

}
