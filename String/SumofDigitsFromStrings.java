package String;

import java.util.Scanner;

public class SumofDigitsFromStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String name=sc.nextLine();
		String str=name.replaceAll("[^0-9]","");
		int num=Integer.parseInt(str);
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		/*for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>'0' || name.charAt(i)<'9'){
				sum+=name.charAt(i)-'0'
			}
	}*/
		System.out.println(sum);
		}

}
