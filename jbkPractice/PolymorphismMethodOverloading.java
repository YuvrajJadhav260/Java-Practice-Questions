package jbkPractice;
import java.util.*;

public class PolymorphismMethodOverloading {
	int price=50;
	
	public void bookTicket() {
		System.out.println("Your 1 seat is booked for Silver class");
		System.out.println("Your total bill is="+price);
	}
	public void bookTicket(int n) {
		System.out.println("\nYour "+n+" seat is booked for Silver class");
		System.out.println("Your total bill is="+price*n);
	}
	public void bookTicket(int n,String str) {
		if("Gold"==str) {
			price=100;
		}
		if("Platinum"==str) {
			price=200;
		}
		
		System.out.println("\nYour "+n+" seat is booked for "+str+" class");
		System.out.println("Your total bill is="+price*n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the class=");
		String str=sc.nextLine();
		System.out.println("Enter the number of seats=");
		int n=sc.nextInt();
		boolean p=str.equals("Gold");
		boolean q=str.equals("Platinum");
		
		
		PolymorphismMethodOverloading mo=new PolymorphismMethodOverloading();
		if(n==1 && p!=true && q!=true) {
		mo.bookTicket();}
		if(n>1 & p!=true & q!=true) {
		mo.bookTicket(n);}
		if(n>1 || p==true || q==true) {	
		mo.bookTicket(n,str);}

	}

}
