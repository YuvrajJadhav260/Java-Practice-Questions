package DiwaliPractice;

import java.util.Arrays;

public class secondLargestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={70,1,23,24,60,50,4,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("the Largest number in array="+arr[arr.length-1]);
		System.out.println("the Second Largest number in array="+arr[arr.length-2]);

	}

}
