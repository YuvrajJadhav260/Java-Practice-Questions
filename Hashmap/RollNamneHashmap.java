package Hashmap;
//Q1. Create a class Student in java and demonstrate the hashmap  by accepting roll number as key and name as value
//insert at least 5 records and display them
import java.util.*;
public class RollNamneHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter Roll=");
			int key=sc.nextInt();
			System.out.println("Enter value=");
			String value=sc.next();
			hm.put(key, value);
			}
		System.out.println(hm);
	}

}
