package Collection;
//WAP to initialize hashset with 10 fruits. Accept name of fruit from user and remove it from the set.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]= {"apple","mango","banana","watermelon","dragonfruit","kiwi","grapes","orange","pineapple","papaya"};
		HashSet<String> hs=new HashSet<>(Arrays.asList(str));
		System.out.println(hs);
		System.out.println("Enter name to remove=");
		String s=sc.nextLine();
		hs.remove(s);
		System.out.println(hs);
	}

}
