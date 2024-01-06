package Overriding;

public class Son extends Father {
	String str="Son";
	public Son() {
		System.out.println("this is son bike bullet");
		
	}
	//public Father() {
		//System.out.println("this is ovverided constructor");
	//}
	//this is example that constructor cannot be ovverided
	public void sonproperty() {
		System.out.println("this is son property");

	}
	public void Property() {
		System.out.println("The Son property getting from the father");
	}
	public String Car() {
		return super.str+" owns BMW";

	}

}
