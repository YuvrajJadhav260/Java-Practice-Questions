package DiwaliPractice;

import java.util.Scanner;

public class CheckvowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String =");
		String s=sc.nextLine();
		String str=s.toLowerCase();
		String str1=str.replaceAll("[^a,e,i,o,u]","");
		String arr[]=str1.split("");
		System.out.println("Vowels are:");
		for(String ss:arr) {
			System.out.println(ss);
		}
	}

}
