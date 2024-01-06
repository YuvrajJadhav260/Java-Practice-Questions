package ExceptionHandling;

import java.util.Scanner;

public class DatatypeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try{
			int n=sc.nextInt();
		}
		catch(Exception e) {
			System.err.println("you are giving wrong datatype");
		}
		finally {
			System.out.println("Done!!");
		}
	}

}
