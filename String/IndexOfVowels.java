package String;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String name=sc.next();

		char arr[]= {'a','e','i','o','u'};
		for(int i=0;i<name.length();i++) {
			int res=Arrays.binarySearch(arr, name.charAt(i));
			boolean test=res>=0 ? true:false;
			if(test) {
				System.out.println("the vowel = "+arr[res]+" found at the index= "+i);
			}
		}	
	}

}
