package String;
import java.util.*;
public class VowelsConsonantSymbolDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String user=sc.nextLine();
		String name=user.toLowerCase();
		String str=name.replaceAll("[^aeiou]","");
		
		String str1=name.replaceAll("[^a-z]","");
		String str5=str1.replaceAll("[aeiou]","");
		
		String str2=name.replaceAll("[a-z0-9]","");
		
		String str3=name.replaceAll("[^0-9]", "");
		
		System.out.println("vowels="+str.length());
		System.out.println("Consonants="+str5.length());
		System.out.println("Symbols="+str2.length());
		System.out.println("Digits="+str3.length());
	}

}
