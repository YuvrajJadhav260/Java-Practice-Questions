package jbkPractice;

public class AreaMethodOverloading {
	void find(int l,int b) {
		System.out.println("Area is="+l*b);
	}
	void find(int l,int b,int h) {
		System.out.println("Area is="+l*b*h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaMethodOverloading am=new AreaMethodOverloading();
		am.find(3,6);
		am.find(3,6,9);

	}

}
