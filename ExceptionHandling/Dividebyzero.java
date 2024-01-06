package ExceptionHandling;

import java.util.Scanner;

public class Dividebyzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a=");
		int a=sc.nextInt();
		System.out.println("Enter the number b=");
		int b=sc.nextInt();
		int res;
		
		try {
		res=a/b;
		System.out.println("Result="+res);}
		
		catch(Exception e){
			System.out.println("cannot divide number by zero");
		}
		
		finally {
			System.out.println("Done !!");
		}
	}

}
