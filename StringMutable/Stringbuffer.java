package StringMutable;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Yuvraj");
		sb.append(" jadhav");
		System.out.println(sb);
		sb.insert(7, "Dipak ");
		System.out.println(sb);
		sb.delete(6, 12);
		System.out.println(sb);
		//StringBuilder sb1=sb;   Error
		//String sb1=sb;  Error
		StringBuffer sb1=sb;
		System.out.println(sb1);
		System.out.println(sb);
		
		//
		StringBuffer sb2=new StringBuffer("JavaBy");
		StringBuffer sb3=sb2;
		sb2.append("kiran");
		System.out.println(sb2+" "+sb3+" "+(sb2==sb3));
	}

}
