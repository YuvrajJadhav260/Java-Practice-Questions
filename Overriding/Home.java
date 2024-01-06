package Overriding;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
		Son s=new Son();
		//Father m=new Son();
		s.fatherProperty();
		s.sonproperty();
		f.Property();
		s.Property();
		String m=s.Car();
		System.out.println(m);
		

	}

}
