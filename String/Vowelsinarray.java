package String;

import java.util.Scanner;

public class Vowelsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String user=sc.nextLine();
		String name=user.toLowerCase();
		
		String vowels=name.replaceAll("[^aeiouu]","");
		String arr[]=vowels.split("");
		for(String str:arr) {
			System.out.println(str);
		}
		
	}

}
