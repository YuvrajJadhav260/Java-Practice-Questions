package PracticeSession;

import java.util.Scanner;

public class Replacelastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toString(n);
		
		int i=str.length();
		
		char templast=str.charAt(i-1);
		char temp=str.charAt(i-1);
		char tempfirst=str.charAt(0);
		
		String str1=str.replace(templast,tempfirst);
		String str2=str1.replaceFirst(Character.toString(tempfirst), Character.toString(temp));
		System.out.println(str2);
		
		
	}

}
