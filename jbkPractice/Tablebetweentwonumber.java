package jbkPractice;
import java.util.*;

public class Tablebetweentwonumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number=");
		int a=sc.nextInt();
		System.out.println("Enter second number=");
		int b=sc.nextInt();
		if(a>b) {
			for(int i=b;i<a;i++) {
				for(int j=1;j<=10;j++) {
					System.out.println(i*j);
				}
			}
		}
		if(a<b) {
			int sum=0;
			for(int i=a;i<=b;i++) {
				if(i%2!=0) {
					sum=sum+i;
				}
			}
			System.out.println(sum);
		}

	}

}
