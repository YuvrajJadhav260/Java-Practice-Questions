package DiwaliPractice;

import java.util.Arrays;
import java.util.Scanner;

public class wordsintodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word=");
		String m=sc.nextLine();
		String n=m.toLowerCase();
		/*int z=0;
		for(int k=1;k<=n.length();k++) {
			String sub=n.substring(z,k);
			for(int j=0;j<str.length;j++) {
				if(sub.contains(str[j])) {
					z=k+1;
					System.out.print(j+" ");
				}
			}
		}*/
		//alternative
		String arr[]=n.split(" ");
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<str.length;j++) {
				if(arr[i].equals(str[j])) {
					System.out.print(j+" ");
				}
			}
		}
	}
}
