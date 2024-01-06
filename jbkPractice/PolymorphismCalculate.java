package jbkPractice;

public class PolymorphismCalculate {
	void sum(int a,int b) {
		System.out.println("Sum is="+(a+b));
	}
	void sum(double a,double b) {
		System.out.println("Sum is="+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismCalculate pc=new PolymorphismCalculate();
		pc.sum(4,5);
		pc.sum(4.6,5.7);

	}

}
