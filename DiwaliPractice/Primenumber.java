package DiwaliPractice;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
			else {
				flag=false;
			}
		}if(n==1) {
			System.out.println("not a prime");
		} 
		else if(flag==true) {
			System.out.println("not a prime");
		}else {
			System.out.println("prime number");
		}
	}

}
