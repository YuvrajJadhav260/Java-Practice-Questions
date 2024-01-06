package jbkPractice;
import java.util.*;

public class NumberDivisibleThreeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number=");
		int n=sc.nextInt();
		System.out.println("Enter second number=");
		int m=sc.nextInt();
		
		System.out.println("Divided By "+n+"=>");
		for(int i=1;i<100;i++) {
			if(i%n==0) {
				System.out.print(i+", ");
			}	
		}
		System.out.println(" ");
		System.out.println("Divided By "+m+"=>");
		for(int i=1;i<100;i++) {
			if(i%m==0) {
				System.out.print(i+", ");
			}
			
		}
		System.out.println(" ");
		System.out.println("Divided By "+n+" and "+m+"=>");
		for(int i=1;i<100;i++) {
			if(i%n==0 && i%m==0) {
				System.out.print(i+", ");
			}
			
		}

	}

}
