package DiwaliPractice;

import java.util.Scanner;

public class fibonnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int sum=0;
		int n=sc.nextInt();
		if(n==0 ||n==1) {
			System.out.println("1");
		}else {
			System.out.print("0 1 ");
		}
		for(int i=2;i<n;i++) {
			sum=n1+n2;
			int n3=sum;
			n1=n2;
			n2=n3;
			System.out.print(sum+" ");
			
		}
	}

}
