package Overriding;

public class Father {
	String str="Father";
	
	public  Father() {
		System.out.println("This is Father Rajdoot");
	}
	public void fatherProperty() {
		System.out.println("this is father property");
	}
	public void Property() {
		System.out.println("The father property getting from the grandfather");
	}
	public String Car() {
		return str+"owns BMW";
	}
}
