package jbkPractice;
class Parent{
	public String company="Mahindra";
	public void show() {
		System.out.println(company);
	}
}

class Child extends Parent{
	public String color="Red";
	public void display() {
		System.out.println(color);
	}
}
public class Inheritance {
	
	public static void main(String args[]) {
		Child cl=new Child();
		cl.show();
		cl.display();
	}

}
