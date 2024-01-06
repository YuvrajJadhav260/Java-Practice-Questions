package DiwaliPractice;
import java.util.*;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String str=sc.nextLine();
		String wstr=str.replaceAll(" ", "");
		System.out.println("String Without Space=\n"+wstr);
	}

}
