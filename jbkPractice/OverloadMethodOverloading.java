package jbkPractice;

public class OverloadMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ol=new Overload();
		double result;
		int add;
		ol.demo(10);
		ol.demo(10,20);
		result=ol.demo(5.5);
		System.out.println("Square of duble="+result);
		add=ol.demo(5,5,5);
		System.out.println("ADD of three="+add);
	}

}
