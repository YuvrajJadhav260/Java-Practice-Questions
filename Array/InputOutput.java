package Array;
import java.util.*;
public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array=");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" of Array=");
			arr[i]=sc.nextInt();
			
		}
		for(int elem:arr) {
			System.out.print(elem+" ");
		}

	}

}
