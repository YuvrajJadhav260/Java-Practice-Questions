package jbkPractice;
class GrandFather{
	public void GrandFather() {
	System.out.println("this is Grandfather");}
}
class Father extends GrandFather{
	public void Father() {
	System.out.println("this is father");}
}
class Son extends Father{
	public void Son() {
	System.out.println("this is Son");}
}
public class MultilevelInheritance extends Son{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance mi=new MultilevelInheritance();
		mi.Son();
		mi.GrandFather();
		mi.Father();

	}

}
