package jbkPractice;

public class TestConstructorGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorGetterSetter cgs=new ConstructorGetterSetter();
		System.out.println("the Id of student is="+cgs.getStudId());
		System.out.println("the name of student is="+cgs.getStudName());
		System.out.println("the Age of student is="+cgs.getStudAge());
		ConstructorGetterSetter cgs1=new ConstructorGetterSetter(321,"jadhav",23);
		System.out.println("the Id of student is="+cgs1.getStudId());
		System.out.println("the name of student is="+cgs1.getStudName());
		System.out.println("the Age of student is="+cgs1.getStudAge());


	}

}
