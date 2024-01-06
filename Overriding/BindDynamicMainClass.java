package Overriding;
class BindDynamic{
	protected String val;
	void display(String str) {
		val="Base class Function".concat(str);
		System.out.println(val);
	}
}
class BindDynamicSubclass extends BindDynamic{
	void display(String str) {
		super.display(str);
		if(val==null) {
			str="Derived class Function ".concat(str);
			System.out.println(str);
		}
	}
}
public class BindDynamicMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BindDynamicSubclass obj=new BindDynamicSubclass();
		obj.display("called");
	}

}
