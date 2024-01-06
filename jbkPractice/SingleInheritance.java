package jbkPractice;
class A{
	public void method() {
		System.out.println("This is Base class method");
	}
}
public class SingleInheritance extends A{
	public void B() {
		System.out.println("This is child class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance B=new SingleInheritance();
		B.method();
		B.B();
		

	}

}
