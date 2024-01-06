package Hashmap;

import java.util.HashMap;
import java.util.Scanner;
//Q4. Create a class Employee and add 5 records  in hashmap print only key and  only value
//and check if a particular employee is valid or not compare by key

public class ValidEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				HashMap<Integer,String> hm=new HashMap<Integer,String>();
				
				for(int i=0;i<5;i++) {
					
					System.out.println("Enter Employee Id=");
					int key=sc.nextInt();
					System.out.println("Enter Employee Name=");
					String value=sc.next();
					hm.put(key, value);
					}
				//System.out.println(hm);
				
				System.out.println("KeySet=\n"+hm.keySet());
				System.out.println("Values=\n"+hm.values());
				
				System.out.println("Enter Employee Id to Check=");
				int n=sc.nextInt();
				System.out.println("Enter Name of Employee to Check=");
				String str=sc.next();

				if(hm.get(n).equals(str)) {
					System.out.println("Valid!!!");
				}else {
					System.out.println("Not Valid!!!");
				}

	}

}
