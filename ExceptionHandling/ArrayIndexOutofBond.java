package ExceptionHandling;

public class ArrayIndexOutofBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,6,4};
		
		try{System.out.println(arr[10]);}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Your array index out of bound");
		}
		finally {
			System.out.println("Done!!");
		}
	}

}
