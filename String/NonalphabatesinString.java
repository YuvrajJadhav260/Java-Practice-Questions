package String;
import java.util.*;

public class NonalphabatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String name=sc.next();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>'z' || name.charAt(i)<'a') {
				System.out.print(name.charAt(i));}
		}
		//if(!Character.isLetter(name.charAt(i))
		//String str=name.replaceAll("[^\\d]", "");
		//System.out.println(str);
		//String str=name.replaceAll("[^0-9]", "");
		//System.out.println(str);
	}

}
