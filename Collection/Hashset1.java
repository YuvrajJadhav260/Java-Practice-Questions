package Collection;
//WAP to accept names of 5 friends & add them into set. Make sure we do NOT add any duplicates.
import java.util.*;
public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();//int cannot be used
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter name=");
			String s=sc.nextLine();
			if(hs.contains(s)) {
				System.err.println("you are trying to add duplicate value="+s);
			}else {
			hs.add(s);}
		}
		System.out.println(hs);
	}

}
