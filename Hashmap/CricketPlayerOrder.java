package Hashmap;
//create a class Cricket and accept 5 entries in hashmap as a record for batting order as key and name as value
//print the hashmap and make suer to update the name of player having odd keys.

import java.util.HashMap;
import java.util.Scanner;

public class CricketPlayerOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				HashMap<Integer,String> hm=new HashMap<Integer,String>();
				
				for(int i=0;i<5;i++) {
					
					System.out.println("Batting Order Number=");
					int key=sc.nextInt();
					System.out.println("Name of Player=");
					String value=sc.next();
					hm.put(key, value);
					}
				System.out.println(hm);
				Object n[]=hm.keySet().toArray();
				for(int i=0;i<n.length;i++) {
					if((int)n[i] % 2!=0) {
						System.out.println((int)n[i]+" is odd number in order of batsman so enter another name of batsman");
						String str=sc.next();
						hm.replace((int)n[i], str);
					}
				}
				System.out.println(hm);
	}

}
