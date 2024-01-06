package DiwaliPractice;

import java.util.Scanner;

public class Digitintowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit=");
		int m=sc.nextInt();
		String s="";
		while(m>0) {
			int rem=m%10;
			s=str[rem]+" "+s;
			m=m/10;
		}
		System.out.println(s);
	}

}
