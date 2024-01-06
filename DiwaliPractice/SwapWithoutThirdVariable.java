package DiwaliPractice;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of A =");
		int a=sc.nextInt();
		System.out.println("Enter value of B =");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A="+a);
		System.out.println("B="+b);

	}

}
