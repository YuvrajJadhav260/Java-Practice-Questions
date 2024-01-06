package AbstractionInterface;

public class Son extends GrandFather implements Mother,Father {
	public void show() {
		super.show();
		System.out.println("this is implements mother and son");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.show();
		System.out.println(Father.strf);
		System.out.println(Mother.strm);
		//System.out.println(GrandFather.strg);
		//this is not possible because the variable in class are default and non-static
		//and in the interface is by default public static and final
	}

}
