package AbstractionInterface;
interface I1{
	String str="Yuvraj";
	public void name(String str);
	public void name();
}
interface I2{
	public void name();
}

public class MultipleInterfaces implements I1,I2{
	public void name() {
		System.out.println("this is name");
	}
	
	public void name(String str) {
		System.out.println("the is name="+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterfaces m=new MultipleInterfaces();
		m.name();
		m.name(str);
	}

}
