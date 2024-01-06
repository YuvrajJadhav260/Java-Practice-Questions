package Collection;

import java.util.ArrayList;
import java.util.Scanner;

//write a program to accept 5 fruits from user and print their index whose length less than 5
public class AssignmentQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as=new ArrayList<String>();
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d String=",(i+1));
			as.add(sc.nextLine());
		}
		System.out.println(as);
		
		for(int i=0;i<as.size();i++) {
			if(as.get(i).length()<5) {
				System.out.println(i);
			}
		}
	}

}
