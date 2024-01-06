package String;

import java.util.Scanner;

public class CheckingEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String name=sc.next();
		
		if(name.endsWith("@gmail.com")) {
			System.out.print("this is ends with gmail.com");
			}
		else if(name.endsWith("yahoo.com.in")) {
			System.out.println("this is ends with yahoo .in");
		}
		else {
			System.out.println("this is not ends with yahoo or gmail");
		}
		
	}
}
