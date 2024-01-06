package Collection;
//WAP to accept 5 strings from the user. Convert it into array and print alternate elements.
import java.util.*;
public class Hashset5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		int n=0;
		while(n<5) {
			System.out.printf("String%d=",n+1);
		
		hs.add(sc.nextLine());
		n++;
		}
		System.out.println("Alternative strings are:");
		
		Object[] o=hs.toArray();
		
		for(int j=0;j<o.length;j++) {
			System.out.printf("String%d=%s\n",j+1,o[j]);
		}
		
		
	}

}
