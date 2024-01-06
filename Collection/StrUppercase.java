package Collection;
import java.util.*;
//Write to accept 5 String from the user and print them all in upper case?
public class StrUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as=new ArrayList<String>();
		ArrayList<String> cas=new ArrayList<String>();

		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d String=",(i+1));
			as.add(sc.nextLine());
			cas.add(as.get(i).toUpperCase());
		}
		System.out.println(as);
		System.out.println(cas);
		
		
	}

}
