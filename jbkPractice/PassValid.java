package jbkPractice;
import java.util.*;

public class PassValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pass=1234;
		int m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Passward=");
		int str=sc.nextInt();
		b1:
		if(str==pass) {
			System.out.println("Welcome");
		}
		else {
			for(int i=0;i<2;i++) {
				if(str==pass) {
					System.out.println("Welcome");
					break b1;
				}
				System.out.println("Wrong Password");
				System.out.println("Enter Passward=");
				str=sc.nextInt();
				
			}
			
			System.out.println("Sorry");
		}
		
		

	}

}
