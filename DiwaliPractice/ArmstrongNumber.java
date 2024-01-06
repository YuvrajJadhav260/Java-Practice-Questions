package DiwaliPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		String str=Integer.toString(n);
		int l=str.length();
		int sum=0;
		
		for(int i=0;i<l;i++) {
			int m=n%10;
			int digitpow=1;
			
			for(int j=0;j<l;j++) {
				digitpow=digitpow*m;
				
			}
			sum=sum+digitpow;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("this is ArmstrongNumber");
		}else {
			System.out.println("this is not ArmstrongNumber");
		}
	}

}
