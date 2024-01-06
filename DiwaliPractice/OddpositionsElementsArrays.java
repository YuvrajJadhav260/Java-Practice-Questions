package DiwaliPractice;

import java.util.Arrays;

public class OddpositionsElementsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,6,45,3};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
