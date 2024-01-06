package PracticeSession;
import java.util.*;
public class factorialandPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
			else {
				flag=false;
			}
		}
		System.out.println(fact);
		System.out.println(flag);
		
	}

}
