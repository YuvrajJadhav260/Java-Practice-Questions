package ExceptionHandling;

public class A {
	
	public static void method1() throws Exception {
	
			System.out.println(5/0);
		
		
	}
	public static void main(String[] args) throws Exception {
		
		method1();
	}	
}