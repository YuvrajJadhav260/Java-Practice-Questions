package Collection;
//WAP to initialize hashset with 5 cars. Accept car name from the user and check if it is present in the set or not.
import java.util.HashSet;
import java.util.Scanner;

public class Hashset4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		int n=0;
		while(n<5) {
			System.out.println("enter  name of car=");
		hs.add(sc.nextLine());
		n++;
		}
		System.out.println("Enter the name you want to check in hashset=");
		String str=sc.nextLine();
		if(hs.contains(str)) {
			System.out.println("Yes, this element is present in hashset");
		}
		else {
			System.err.println("No,this element is not present in hashset");
		}
	}

}
