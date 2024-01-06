package jbkPractice;
import java.util.*;
public class TableformNtoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number=");
		int n=sc.nextInt();
		System.out.println("Enter Second number=");
		int m=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=m;j<=10;j++) {
				System.out.print(i*j+" ");
			}
		System.out.print("\n");
		}

	}

}
