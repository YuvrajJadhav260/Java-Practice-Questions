package String;

import java.util.Scanner;

public class CheckConsecutiveCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kjxggg=false
		//ajshggkjd=true
		//zdrgzer=false
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String user=sc.nextLine();
		String name=user.toLowerCase();
		boolean flag=false;
		
		for(int i=1;i<name.length()-1;i++) {
			boolean left=Character.toString(name.charAt(i-1)).equals("g");
			boolean curr=Character.toString(name.charAt(i)).equals("g");
			boolean right=Character.toString(name.charAt(i+1)).equals("g");

			if(curr==true) {
				if(left || right) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}	
		}
		System.out.println(flag);
	}

}
