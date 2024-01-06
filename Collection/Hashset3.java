package Collection;
//WAP to accept few planet names and print unique planet names.
import java.util.HashSet;
import java.util.Scanner;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter name of planet=");
			String s=sc.nextLine();
			if(hs.contains(s)) {
				System.err.println("you are trying to add duplicate value="+s);
			}else {
			hs.add(s);}
		}
		System.out.println("The unique names of planets are:");
		Object arr[]=hs.toArray();
		for(Object o:arr) {
			System.out.print(o+" , ");
		}
	}

}
