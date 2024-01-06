package MultidimensionalArray;
import java.util.Arrays;
public class MethodsofArrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {2,1,3,5,4};


		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.fill(arr, 4);
		System.out.println(Arrays.toString(arr));
		
		int[] a=Arrays.copyOf(arr, 10);
		System.out.println();
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(arr1,3));
		
		System.out.print(Arrays.stream(arr1).max().orElse(0));
		
		
		
		
	}

}
