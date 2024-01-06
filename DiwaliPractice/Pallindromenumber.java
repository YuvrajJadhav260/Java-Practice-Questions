package DiwaliPractice;
import java.util.*;
public class Pallindromenumber {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("This is pallindrom number");
		}else {
			System.out.println("Not pallindrom number");
		}
	}
}
