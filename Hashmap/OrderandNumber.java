package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

//Q2. Crreate a class Orders in java and demonstrate the hashmap by accptihng table number as key and order as value  accept 5 values in hashmap and check for a particular order in hashmap

public class OrderandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter table number=");
			int key=sc.nextInt();
			System.out.println("Enter order=");
			String value=sc.next();
			hm.put(key, value);
			}
		System.out.println(hm);
		
		System.out.println("Enter the table number you want to explore=");
		int n=sc.nextInt();
		System.out.println("order of table no"+n+"="+hm.get(n));
	}

}
