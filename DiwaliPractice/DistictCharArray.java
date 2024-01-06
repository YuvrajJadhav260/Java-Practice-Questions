package DiwaliPractice;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
public class DistictCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String str=sc.nextLine();
		String arr[]=str.split("");
		HashSet<String> hs=new HashSet<String>(Arrays.asList(arr));
		Object[] str1=hs.toArray();
		for(int i=0;i<str1.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(str1[i].equals(arr[j])) {
					count++;
				}
			}
			System.out.println("char= "+str1[i]+" count= "+count);
		}
	}

}
