package jbkPractice;

public class ConstructorOverloading {
	int a;
	int b;
	public ConstructorOverloading() {
		a=10;
		b=20;
		System.out.println("Inside 1st Constructor");
	}
	public ConstructorOverloading(int m,int n) {
		a=m;
		b=n;
		System.out.println("Inside 2st Constructor");
	}
	public ConstructorOverloading(int l) {
		a=l;
		System.out.println("Inside 3st Constructor");
	}
	public void display() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co=new ConstructorOverloading();
		ConstructorOverloading co1=new ConstructorOverloading(30,40);
		ConstructorOverloading co2=new ConstructorOverloading(50);
		co.display();
		co1.display();
		co2.display();

	}

}
