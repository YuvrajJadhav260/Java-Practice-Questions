package MultidimensionalArray;
import java.util.*;
public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Rows=");
		int row=sc.nextInt();
		
		
		String[][] arr=new String[row][3];
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter the name=");
			arr[i][0] =sc.next();
			System.out.println("Enter the Roll=");
			arr[i][1] =sc.next();
			System.out.println("Enter the percent=");
			arr[i][2] =sc.next();
		}
		System.out.println("Name\tRoll\tPercent");
	for(String a[]:arr) {
		for(String n:a) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}
	
	}

}
