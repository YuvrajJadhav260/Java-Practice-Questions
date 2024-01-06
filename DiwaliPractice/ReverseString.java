package DiwaliPractice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String =");
		String str=sc.nextLine();
		String revstr="";
		for(int i=0;i<str.length();i++) {
			revstr=str.charAt(i)+revstr;
		}
		System.out.println("The reverse String is:\n"+revstr);
	}

}
