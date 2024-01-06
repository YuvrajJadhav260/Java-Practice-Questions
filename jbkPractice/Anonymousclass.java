package jbkPractice;

interface Demo{
	void disp();
}

public class Anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo() {
			public void disp() {
				// TODO Auto-generated method stub
				System.out.println("yuvraj");
			}
		};
		d.disp();
	
}
}
