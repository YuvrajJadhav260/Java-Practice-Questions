package GarbageCollection;
import java.util.*;
public class Tree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Tree t1=new Tree();

		Tree t2=new Tree();
		
		System.out.println("From object t1 and t2 which one you want to Destroy=");
		String str=sc.next();
		
		if(str.equals("t1")) {
			t1=null;
			System.out.println("The t1 has been Destroy");
	}else if(str.equals("t2")) {
		t2=null;
		System.out.println("The t1 has been Destroy");
	}else {
		System.out.println("Enter valid object");
		}
		System.gc();
	}

}
