package String;
import java.util.*;
public class Vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String name=sc.next();
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("number of vowels="+count);
	}

}
