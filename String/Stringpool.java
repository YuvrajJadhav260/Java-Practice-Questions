package String;

public class Stringpool {
	String str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Yuvraj";//use String pool
		String str1="jadhav";
		String n=str+"jadhav";
		String str2="Yuvraj";
		String str3=new String("Yuvraj");
		String str4=new String("Yuvraj");
		String m="Yuvrajjadhav";

		
		System.out.println(str==str2);//same memory location
		System.out.println(str==str3);//same content but diff memory location
		System.out.println(str4==str3);//same content but diff memory location
		System.out.println(n);
		System.out.println(m);
		System.out.println(n==m);

	}

}
